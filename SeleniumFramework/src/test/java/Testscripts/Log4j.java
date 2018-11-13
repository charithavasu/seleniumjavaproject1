package Testscripts;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log4j {
	private static Logger Logger1 = new LogManager.getLogger(Log4j.class);
	

	public static void main(String[] args) {
		System.out.println("/n Hello World /n");
		Logger.info("This is  information message");
		

	}

}
