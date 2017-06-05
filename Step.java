package main;

//import java.util.List;

import generics.InvalidActionException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class Step 
{
	public static Logger l=Logger.getLogger("Step");
public static void executeStep(WebDriver driver,String action,String input1,String input2){
	l.info("Action:"+action);
	l.info("input1:"+input1);
	l.info("input2:"+input2);
	if(action.equalsIgnoreCase("enter"))
	{
		driver.findElement(By.xpath(input1)).sendKeys(input2);
	}
	else if(action.equalsIgnoreCase("click")){
		driver.findElement(By.xpath(input1)).click();
	}
	else if(action.equalsIgnoreCase("verifyElementPresent")){
		
		Action.verifyElementPresent(driver, input1);
	}
	else if(action.equalsIgnoreCase("verifyElementNotPresent")){
		
		Action.verifyElementNotPresent(driver, input1);
	}
	else if (action.equalsIgnoreCase("verifyTitle")) 
	{
		Action.verifyTitle(driver, input1);
	}
		
	else
	{
		throw new InvalidActionException("invalid action:"+action);
	}
 }
}
