package responsibilityPattern;

public class ResponsibilityPattern {
	private static Logger doChaining(){  
        Logger consoleLogger = new ConsoleBased(Logger.OUTPUTINFO);  
          
        Logger errorLogger = new ErrorBased(Logger.ERRORINFO);  
        consoleLogger.setNextLevelLogger(errorLogger);  
          
        Logger debugLogger = new DebugBased(Logger.DEBUGINFO);  
        errorLogger.setNextLevelLogger(debugLogger);  
          
        return consoleLogger;   
        }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger chainLogger= doChaining();  
		  
        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");  
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");  
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");  
        }  

	}


