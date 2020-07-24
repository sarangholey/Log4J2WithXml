package testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class testlogger {
	
	//What is log? : capturing info/activities at the time of program execution. 
		// types of logs:
			//0. trace
			//1. info
			//2. warn
			//3. debug
			//4. fatal
			
	//how to generate the logs? : use Apache log4j API (log4j jar)
	//How it works? : it reads log 4j configuration from log4j.properties file
	//where to create: create inside resources folder
	
	public static Logger mylogger = LogManager.getLogger(testlogger.class);
	
	public static void main(String[] args) {
		
			
			System.out.println("This is a test logger started");
			mylogger.trace("This is info trace message");
			mylogger.info("This is info log message");
			mylogger.error("This is error log message");
			mylogger.warn("This is error warn message");
			mylogger.fatal("This is error fatal message");
			System.out.println("This is a test logger ended");
			
		
	}

}
