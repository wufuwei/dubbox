package javacommon.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 功能：计算时间 上月开始、上月结束、本月开始、本月结束、上周开始、上周结束、本周开始、本周结束、昨天开始、昨天结束、今天开始、今天结束
 * 
 * @see
 * @version2007-06-07
 * 
 **/
public class StartAndEndOfDate {
	public static enum DateTag {
		LAST_HALF_YEAR_START,
		LAST_HALF_YEAR_END,
		LAST_MONTH_START, 
		LAST_MONTH_END, 
		THIS_MONTH_START, 
		THIS_MONTH_END,
		LAST_WEEK_START,
		LAST_WEEK_END, 
		THIS_WEEK_START,
		THIS_WEEK_END, 
		YESTERDAY_START,
		YESTERDAY_END, 
		TODAY_START,
		TODAY_END, 
		NOW,
		RECENT_MONTH_START, 
		RECENT_MONTH_END, 
		RECENT_WEEK_START,
		RECENT_WEEK_END, 
		RECENT_DAY_START,
		RECENT_DAY_END, 
	};

	/**
	 * 功能：计算时间 上月开始、上月结束、本月开始、本月结束、上周开始、上周结束、本周开始、本周结束、昨天开始、昨天结束、今天开始、今天结束
	 * 格式：2007-06-01 00:00:00 2007-06-30 23:59:59 本月结束、本周结束、今天结束 都指的是当前日期时间
	 * 一周按照：星期一至星期天来计算
	 * 
	 * @paramtag
	 * @returnString
	 * 
	 */
	public static String getStartAndEndDate(DateTag tag) {
		String resultString;
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		java.text.DateFormat formatFull = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		String now = formatFull.format(date);
		java.text.DateFormat format = new java.text.SimpleDateFormat(
				"yyyy-MM-dd");
		switch (tag) {
		case LAST_HALF_YEAR_START:// 半年前开始
			cal.add(Calendar.MONTH, -6);
			cal.set(Calendar.DATE, 1);
			String lastHalfYearStart = format.format(cal.getTime()) + " 00:00:00";
			// 半年前开始（上月1号）
			cal.clear();
			resultString = lastHalfYearStart;
			break;
		case LAST_HALF_YEAR_END:// 结束
			resultString = now;
			break;
		case LAST_MONTH_START:// 上月开始
			cal.add(Calendar.MONTH, -1);
			cal.set(Calendar.DATE, 1);
			String lastMonthStart = format.format(cal.getTime()) + " 00:00:00";
			// 上月开始（上月1号）
			cal.clear();
			resultString = lastMonthStart;
			break;
		case LAST_MONTH_END:// 上月结束
			cal = Calendar.getInstance();
			cal.add(Calendar.MONTH, -1);
			cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			String lastMonthEnd = format.format(cal.getTime()) + " 23:59:59";// 上月结束（上月最后一天）
			cal.clear();
			resultString = lastMonthEnd;
			break;
		case THIS_MONTH_START:// 本月开始
			cal = Calendar.getInstance();
			cal.add(Calendar.MONDAY, 0);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			String thisMonthStart = format.format(cal.getTime()) + " 00:00:00";// 本月开始（本月1号）
			cal.clear();
			resultString = thisMonthStart;
			break;
		case THIS_MONTH_END:// 本月结束
			String thisMonthEnd = now;// 本月结束（即：当前时间）
			resultString = thisMonthEnd;
			break;
		case LAST_WEEK_START:// 上周开始
			cal = Calendar.getInstance();
			cal.add(Calendar.WEEK_OF_YEAR, -1);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
			String lastWeekStart = format.format(cal.getTime()) + " 00:00:00";// 上周开始（即：上周一）
			cal.clear();
			resultString = lastWeekStart;
			break;
		case LAST_WEEK_END:// 上周结束
			cal = Calendar.getInstance();
			cal.add(Calendar.WEEK_OF_YEAR, 0);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			String lastWeekEnd = format.format(cal.getTime()) + " 23:59:59";// 上周结束（即：上周日）
			cal.clear();
			resultString = lastWeekEnd;
			break;
		case THIS_WEEK_START:// 本周开始
			cal = Calendar.getInstance();
			cal.add(Calendar.WEEK_OF_YEAR, 0);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
			String thisWeekStart = format.format(cal.getTime()) + " 00:00:00";// 本周开始（即：本周一）
			cal.clear();
			resultString = thisWeekStart;
			break;
		case THIS_WEEK_END:// 本周结束
			String thisWeekEnd = now;// 本周结束(即：当前时间)
			resultString = thisWeekEnd;
			break;
		case YESTERDAY_START:// 昨天开始
			cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -1);
			format = new java.text.SimpleDateFormat("yyyy-MM-dd");
			String yesterdayStart = format.format(cal.getTime());
			yesterdayStart = yesterdayStart + " 00:00:00";// 昨天开始
			cal.clear();
			resultString = yesterdayStart;
			break;
		case YESTERDAY_END:// 昨天结束
			cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -1);
			format = new java.text.SimpleDateFormat("yyyy-MM-dd");
			String yesterdayEnd = format.format(cal.getTime());
			yesterdayEnd = yesterdayEnd + " 23:59:59";// 昨天结束
			cal.clear();
			resultString = yesterdayEnd;
			break;
		case TODAY_START:// 今天开始
			String todayStart = format.format(date) + " 00:00:00";// 今天开始
			resultString = todayStart;
			break;
		case TODAY_END:// 今天结束
			String todayEnd = now;// 今天结束（即；当前时间）
			resultString = todayEnd;
			break;
			
		case RECENT_MONTH_START:// 最近一个月开始
			cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -30);
			format = new java.text.SimpleDateFormat("yyyy-MM-dd");			
			resultString = format.format(cal.getTime()) + " 00:00:00";;
			cal.clear();
			break;	
		case RECENT_MONTH_END:// 最近一月结束，即昨晚时间
			cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -1);
			format = new java.text.SimpleDateFormat("yyyy-MM-dd");			
			resultString = format.format(cal.getTime()) + " 23:59:59";;
			cal.clear();
			break;	
		case RECENT_WEEK_START:// 最近一周开始
			cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -7);
			format = new java.text.SimpleDateFormat("yyyy-MM-dd");			
			resultString = format.format(cal.getTime()) + " 00:00:00";;
			cal.clear();
			break;	
		case RECENT_WEEK_END:// 最近一周结束，即昨晚时间
			cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -1);
			format = new java.text.SimpleDateFormat("yyyy-MM-dd");			
			resultString = format.format(cal.getTime()) + " 23:59:59";;
			cal.clear();
			break;	
		case RECENT_DAY_START:// 最近一天开始
			cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -1);
			format = new java.text.SimpleDateFormat("yyyy-MM-dd");			
			resultString = format.format(cal.getTime()) + " 00:00:00";;
			cal.clear();
			break;	
		case RECENT_DAY_END:// 最近一天结束，即昨晚时间
			cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -1);
			format = new java.text.SimpleDateFormat("yyyy-MM-dd");			
			resultString = format.format(cal.getTime()) + " 23:59:59";;
			cal.clear();
			break;	
		default:// 没有匹配的，返回当前时间
			resultString = now;
		}
		return resultString;
	}
	
	public static String getRecentDateStart(int days){
		Calendar cal = Calendar.getInstance();
		java.text.DateFormat format = new java.text.SimpleDateFormat(
				"yyyy-MM-dd");
		cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -days);		
		String resultString = format.format(cal.getTime()) + " 00:00:00";;
		cal.clear();
		return resultString;
	}
	
	public static void main(String[] args){
		System.out.println(StartAndEndOfDate.getRecentDateStart(0));
		System.out.println(DateTag.RECENT_MONTH_START);
	}
}
