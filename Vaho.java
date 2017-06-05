package DoneDone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vaho 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(" http://vaho.co.in/");
		Thread.sleep(1000);
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@id='check_location']/div[2]/div/div[1]/button")).click();
		Thread.sleep(1000);
	
//		driver.findElement(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[6]/a")).click();
//		driver.findElement(By.xpath("//div[@id='check_location']/div[2]/div/div[1]/button")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("cname")).sendKeys("shamini");
//		driver.findElement(By.id("cphone")).sendKeys("9900155323");
//		driver.findElement(By.id("cemail")).sendKeys("shamini@gmail.com");
//		driver.findElement(By.xpath("//div[@id='contact-Form']/div[5]/button")).click();
//		driver.findElement(By.xpath("//button[@onclick='show_alert();']")).click();
//		Thread.sleep(1000);
//		driver.close();
		driver.findElement(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[7]/a")).click();
		driver.findElement(By.id("location")).sendKeys("Gottigere Bus Stop, Gottigere, Bengaluru, Karnataka, India");
		driver.findElement(By.xpath("//form[@id='check_locationForm']/div[8]/button")).click();
		driver.findElement(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul[2]/li[8]/a")).click();
		driver.findElement(By.id("log_email")).sendKeys("munendra97@gmail.com");
		System.out.println(driver.findElement(By.id("log_email")).getAttribute("value"));
		driver.findElement(By.id("log_password")).sendKeys("qwerty");
		System.out.println(driver.findElement(By.id("log_password")).getAttribute("value"));
		driver.findElement(By.xpath("//form[@id='loginForm']/div[5]/button")).click();
		driver.findElement(By.xpath("//div[1]/main/ul/li[3]/a/img")).click();//ul[@class='nav nav-tabs']/li[3]/a/img
	}
}