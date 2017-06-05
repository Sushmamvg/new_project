package main;

import generics.Excel;
import generics.Utility;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Suite implements AutoConst
{
public static void executeSuite(String browser)
{
	int passCount=0;
	int failCount=0;
	int skipCount=0;
	ArrayList<String> passList=new ArrayList<String>();
	ArrayList<String> failList=new ArrayList<String>();
	
	Logger l=Logger.getLogger("Suite");
	int scriptCount=Excel.getRowCount(SUITE_PATH,TREESET);
	l.info("scriptCount:"+scriptCount);
	for(int i=1;i<=scriptCount;i++){
		String scriptName=Excel.getCellValue(SUITE_PATH,TREESET,i,0);
		String scriptStatus=Excel.getCellValue(SUITE_PATH,TREESET,i,1);
 		if(scriptStatus.equalsIgnoreCase("yes"))
 		{
 			WebDriver driver;
 			if (browser.equalsIgnoreCase("firefox")) 
 			{
 				System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
 				driver=new FirefoxDriver();
			}
 			else
 			{
 				System.setProperty(CHROME_KEY, CHROME_PATH);
 				driver=new  ChromeDriver(); 
 			}
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			String url=Utility.getPropertyValue(SETTING_PATH, "URL");
			driver.get(url);
			l.info("Executing the script:"+scriptName);
			try{
					Script.executeScript(driver,scriptName);
					l.info("Script execution Passed:");
					passCount++;
					passList.add(scriptName);
			}
			catch(Exception e){
				l.info("Script execution failed:");
				failCount++;
				Utility.getScreenShot(driver,scriptName);
				failList.add(scriptName);
			}
			l.info("End of the script:"+scriptName);
			driver.close();
		  }
		 else {
			 l.info("Not Executing the script:"+scriptName);
			 skipCount++;
		 }
		}//loop
	
		l.info("Total Pass:"+passCount);
		l.info("Total Fail:"+failCount);
		l.info("Total Skip:"+skipCount);
		
		l.info("Failed Scripts:");
		for(String name:failList)
			l.info(name);
		
		l.info("Passed Scripts:");
		for(String name:passList)
			l.info(name);
		
    }//method
}//class





