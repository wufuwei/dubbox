package javacommon.log.appender;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import javacommon.log.LogHelper;


public class TestBizTimeSizeRollingFileAppender {
public static void main(String[] args) {
	

	
	System.setProperty("logOutputPath","f:\\logs");
	System.setProperty("realIP","10.1.1.1");
	LogHelper.setLogRootPath("F:\\tel_workspace\\ciss\\ciss\\conf");
	DOMConfigurator.configure("F:\\tel_workspace\\ciss\\ciss\\conf\\log4j.xml");
	
	Logger logger = Logger.getLogger("eventInfoLogger"); 
	
	

	for(;;)
	{
		
	 logger.error(new Date()+"info"); 
	 try {
		Thread.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
}
