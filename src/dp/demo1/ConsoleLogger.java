package dp.demo1;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dp.demo1.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Console::Logger: " + message);
	}

}
