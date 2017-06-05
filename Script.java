package main;

import generics.Excel;
//import generics.InvalidActionException;

import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Script implements AutoConst {
public static Logger l=Logger.getLogger("Script");
public static void executeScript(WebDriver driver,String sheet){
	int stepCount=Excel.getRowCount(SCRIPT_PATH,sheet);
	for(int j=1;j<=stepCount;j++){
		String desc=Excel.getCellValue(SCRIPT_PATH,sheet,j,0);
		String action=Excel.getCellValue(SCRIPT_PATH,sheet,j,1);
		String input1=Excel.getCellValue(SCRIPT_PATH,sheet,j,2);
		String input2=Excel.getCellValue(SCRIPT_PATH,sheet,j,3);
		l.info(desc);
		Step.executeStep(driver, action, input1, input2);
	}//loop
  }//method
}//class
