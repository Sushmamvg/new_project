package generics;

import org.apache.log4j.Logger;

public class InvalidActionException extends RuntimeException
{
	public static Logger l=Logger.getLogger("InvalidActionException");
	public InvalidActionException(String msg)
	{
		l.info(msg);
	}
}
