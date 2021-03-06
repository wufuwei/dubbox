package javacommon.log.appender;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

public class MinuteRollingAppender extends FileAppender
{
	 /** 
     * The date pattern. By default, the pattern is set to "'.'yyyy-MM-dd" 
     * meaning daily rollover. 
     */  
    private String datePattern = "'.'yyyy-MM-dd-HH-mm"; 
    /** 
     * 间隔时间，单位：分钟 
     */  
    private int intervalTime = 10;  
    
	/** 
     * The log file will be renamed to the value of the scheduledFilename 
     * variable when the next interval is entered. For example, if the rollover 
     * period is one hour, the log file will be renamed to the value of 
     * "scheduledFilename" at the beginning of the next hour. 
     *  
     * The precise time when a rollover occurs depends on logging activity. 
     */  
    private String scheduledFilename;
    /** 
     * The next time we estimate a rollover should occur. 
     */  
    private long nextCheck = System.currentTimeMillis() - 1L;
    Date now  = new Date();;
    SimpleDateFormat sdf;
    RollingCalendar rc = new RollingCalendar();
	    
    public MinuteRollingAppender()
    {
    }

    public MinuteRollingAppender(Layout layout, String filename, String datePattern)
        throws IOException
    {
        super(layout, filename, true);
        this.datePattern = datePattern;
        nextCheck = rc.getNextCheckMillis(now);
        activateOptions();
    }

    public int getIntervalTime() {
		return intervalTime;
	}

	public void setIntervalTime(int intervalTime) {
		this.intervalTime = intervalTime;
	}

	public String getDatePattern() {
		return datePattern;
	}

	public void setDatePattern(String datePattern) {
		this.datePattern = datePattern;
	}

	public void activateOptions()
    {
        super.activateOptions();
        if(super.fileName != null)
        {
            now.setTime(System.currentTimeMillis());
            sdf = new SimpleDateFormat(datePattern);
            File file = new File(super.fileName);
            scheduledFilename = super.fileName + sdf.format(new Date(file.lastModified()));
        } else
        {
            LogLog.error("Either File or DatePattern options are not set for appender [" + super.name + "].");
        }
    }

    void rollOver()
        throws IOException
    {
        String datedFilename = super.fileName + sdf.format(now);
        if(scheduledFilename.equals(datedFilename))
            return;
        closeFile();
        File target = new File(scheduledFilename);
        if(target.exists())
            target.delete();
        File file = new File(super.fileName);
        boolean result = file.renameTo(target);
        if(result)
            LogLog.debug(super.fileName + " -> " + scheduledFilename);
        else
            LogLog.error("Failed to rename [" + super.fileName + "] to [" + scheduledFilename + "].");
        try
        {
            setFile(super.fileName, false, super.bufferedIO, super.bufferSize);
        }
        catch(IOException e)
        {
            super.errorHandler.error("setFile(" + super.fileName + ", false) call failed.");
        }
        scheduledFilename = datedFilename;
    }

    protected void subAppend(LoggingEvent event)
    {
        long n = System.currentTimeMillis();
        if(n >= nextCheck)
        {
            now.setTime(n);
            nextCheck = rc.getNextCheckMillis(now);
            try
            {
                rollOver();
            }
            catch(IOException ioe)
            {
            	if (ioe instanceof InterruptedIOException)  
                {  
                    Thread.currentThread().interrupt();  
                }  
                LogLog.error("rollOver() failed.", ioe);
            }
        }
        super.subAppend(event);
    }

   
    class RollingCalendar extends GregorianCalendar
    {
    	private static final long serialVersionUID = -3560331770601814177L;
	    int type;
	    RollingCalendar()
   	 	{
   		   super();  
   	 	} 

	    public long getNextCheckMillis(Date now)
	    {
	        return getNextCheckDate(now).getTime();
	    }
    	    
	    public Date getNextCheckDate(Date now)
	    {
	    	this.setTime(now);  
            this.set(Calendar.SECOND, 0);  
            this.set(Calendar.MILLISECOND, 0);  
            this.add(Calendar.MINUTE, intervalTime);  
            return getTime();  
	    }
    }
    
}
