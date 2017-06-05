package generics;
import org.apache.log4j.Logger;


public class TitleMisMatchException extends RuntimeException 
{
	public Logger l=Logger.getLogger(this.getClass().getName());
		public TitleMisMatchException (String msg) 
		{
			l.error(msg);
		}
}
