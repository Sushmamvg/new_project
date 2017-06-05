package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	static Logger l=Logger.getLogger("Utility");
	
	public static void getScreenShot(WebDriver driver,String scriptName)
	{
		
		SimpleDateFormat s=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String res = s.format(new Date());
		String imagePath="./screenshots/"+scriptName+"_"+res+".png";
		l.info("imagePath:"+imagePath);
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File(imagePath);
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(IOException e)
		{
			
		}
		
	}//method
	
	public static String getPropertyValue(String path, String key)
	{
		l.info("Reading property file:"+path);
		l.info("Reading key:"+key);
		String v="";
		try
		{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
			l.info("key value is:"+v);
		}
		catch(Exception e)
		{
			l.error("Exception while reading key from properties file");
		}
		return v;
		
	}//mathod
	
}//class
