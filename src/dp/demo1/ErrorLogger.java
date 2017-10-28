package dp.demo1;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dp.demo1.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Error::Logger " + message);
	}
}
