package javacommon.log;

import java.util.logging.Level;
import java.util.logging.Logger;


public class LogHelper
{
    /***   log文件根路径     */
    private static String LOG_ROOT_PATH = ".";
     
    
    public static void setLogRootPath(String logRootPath) {
        
        LOG_ROOT_PATH = logRootPath;
        
    } 
    
    
    public static String getLogRootPath() {
        
         return LOG_ROOT_PATH ;
         
         
    }
    /**
     * 用jdk log 打印日志
     * 其他组件未初始化之前
     * @param msg
     */
    public static void log(String msg){
    	Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, msg);
    }
}
