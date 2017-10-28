package dp.demo1;

public class FileLogger extends AbstractLogger {
	public FileLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dp.demo1.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("File::Logger " + message);

	}
}
