package javacommon.base;


//静态导入日期转换方法
import java.sql.Timestamp;

/**
 * @author badqiu
 */
public class BaseEntity implements java.io.Serializable {
	public final static String TERMINALUSER="terminaluser";
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
	public static final String TIME_FORMAT = "HH:mm:ss";
	
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_TIME_FORMAT_CONN = "yyyyMMddHHmmss";
	public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.S";	
	
	
	public static String date2String(java.util.Date date,String dateFormat) {
		return DateConvertUtils.format(date,dateFormat);
	}
	
	public static <T extends java.util.Date> T string2Date(String dateString,String dateFormat,Class<T> targetResultType) {
		return DateConvertUtils.parse(dateString,dateFormat,targetResultType);
	}
	
	public static String getCurrentDatetimeString(){
		return date2String(new java.util.Date(),DATE_TIME_FORMAT);
	}
	
	public static Timestamp getCurrentDatetime(){
		return new Timestamp(System.currentTimeMillis());
	}
	
	private String sortColumns;
	

	public String getSortColumns() {
		return sortColumns;
	}

	public void setSortColumns(String sortColumns) {
		this.sortColumns = sortColumns;
	}

	

}
