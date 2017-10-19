package LoggingExample;

import org.apache.log4j.Logger;

public class LoggingExample {
	
	private static Logger log = Logger.getRootLogger();

	public static void main(String[] args) {
		log.trace("trace message");  // usually in resources folder that you set log level in log4j.properties
		log.debug("debug message");
		log.info("info message");
		log.warn("warning message");
		log.error("error message");
		log.fatal("fatal message");
		
		

	}

}
