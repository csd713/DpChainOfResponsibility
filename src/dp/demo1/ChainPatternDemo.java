package dp.demo1;

public class ChainPatternDemo {

	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

		// Creating the chain of objects
		fileLogger.setNextLogger(errorLogger);
		errorLogger.setNextLogger(consoleLogger);

		return fileLogger;
	}

	public static void main(String[] args) {

		AbstractLogger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

}
