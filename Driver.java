package main;

//import java.io.IOException;
//import java.net.MalformedURLException;

import org.apache.log4j.Logger;
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Driver extends Thread 
{
	public String browser;
	public Driver(String brower)
	{
		this.browser=browser;
	}
	public void run()
	{
		Suite.executeSuite(browser);
	}
 public static void main(String[] args) throws InterruptedException
 {
	 Logger l=Logger.getLogger("Driver");
	 l.info("Framework execution started");
	 l.info("Framework execution ended");
	 Driver d1=new Driver("firefox");
	 d1.start();
	 Driver d2=new Driver("chrome");
	 d2.start();
	
 }
}
