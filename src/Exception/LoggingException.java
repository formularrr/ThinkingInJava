package Exception;
import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class LoggingException {
	private static Logger logger = Logger.getLogger("LoggingException");
	
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args){
		try{
			throw new NullPointerException();
		}catch(NullPointerException e){
			logException(e);
		}
	}
}