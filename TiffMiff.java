package DoneDone;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TiffMiff
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://tiffmiffs.com/tiffmiff/");
		driver.findElement(By.id("login_user")).sendKeys("sushma.deuglo@gmail.com");
		driver.findElement(By.id("login_pass")).sendKeys("sushma");
		driver.findElement(By.xpath("//form[@id='lgnform']/input")).click();
		/*-------------------------------------------------------------------------------------------------------------------	*/
		System.out.println("Home status");
		
		/*System.out.println();
		
		
		driver.findElement(By.id("status")).sendKeys("India is famous for what, give the answer which is most typical");
		driver.findElement(By.id("post_button")).click();
		System.out.println("1 status posted");
		driver.findElement(By.xpath("//a[@id='uimage_tab']/label/i")).click();
		Runtime.getRuntime().exec("F:/all/Selenium/AutoIt Prgs/file_upload.exe");
		Thread.sleep(20000);
		System.out.println("2 pic uploaded");
		driver.findElement(By.id("status")).sendKeys("Few comments about TJIT college plzzz");
		System.out.println("3 status entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Post']")).submit();
		Thread.sleep(2000);
		System.out.println("4 pic posted");
		driver.findElement(By.id("uvideo_tab")).click();
		driver.findElement(By.id("pvideo")).sendKeys("https://www.youtube.com/watch?v=W0EWAPtT3KM");
		System.out.println("5 video link");
		driver.findElement(By.id("status")).sendKeys("Cast it");
		System.out.println("6 status entered");
		driver.findElement(By.xpath("//button[.='Post']")).submit();
		System.out.println("7 Vedio posted");*/
		/*-------------------------------------------------------------------------------------------------------------------	*/
	/*	System.out.println();
		System.out.println("My Timeline");
		
		driver.findElement(By.xpath("//div[@id='subnav']/ul[1]/li[2]/a")).click();
		System.out.println("1 scrolling started");
		JavascriptExecutor j= (JavascriptExecutor) driver;
		System.out.println("2 scroll down");
		//Thread.sleep(2000);
		//j.executeScript("window.scrollBy(0,250)", "");
		//j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("3 scrolling ended");
		
		String atitle = driver.getTitle();
		String etitle = "Tiffmiff | My Timeline";
		Assert.assertEquals(atitle, etitle);
		System.out.println("4 title of the page: " + atitle);
		
		
		//j.executeScript("window.scrollBy(0,-250)", "");
		System.out.println("5 scroll up");
		//Thread.sleep(2000);
		//j.executeScript("window.scrollBy(document.body.scrollHeight,0)");
		j.executeScript("window.scrollBy(document.body.scrollHeight,0)");*/
		/*-------------------------------------------------------------------------------------------------------------------	*/
		/*System.out.println();
		System.out.println("1 Entered About you link");
		driver.findElement(By.xpath("//div[@id='content']/div/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);*/
		/*-------------------------------------------------------------------------------------------------------------------	*/
		/*System.out.println();
		System.out.println("2 Entered Create tiffmiff link");
		driver.findElement(By.xpath("//div[@id='subnav']/ul[1]/li[3]/a")).click();
		driver.findElement(By.id("topic_name")).sendKeys("Take it anyways");
		driver.findElement(By.id("topic_desc")).sendKeys("If somebody's making fun of you, its because you made a mistake" + "Don't go down because of it");
		driver.findElement(By.xpath("//div[@id='topic']/div/div[2]/button")).click();*/
		
	    /*-------------------------------------------------------------------------------------------------------------------	*/
		System.out.println();
		System.out.println("3 Entered into wishboard page");
		driver.findElement(By.xpath("//div[@id='subnav']/ul[1]/li[4]/a")).click();
		driver.findElement(By.id("wish_txt")).sendKeys("Have your own wish");
		driver.findElement(By.id("myBtn")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@id='alert_wish_validtn']/div/div/div[2]/button"));
		System.out.println("complted wishboard");
		/*-------------------------------------------------------------------------------------------------------------------	*/
		/*System.out.println();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='main-nav']/ul/li[5]/a/img")).click();
		driver.findElement(By.xpath("//div[@id='main-nav']/ul/li[5]/ul/li[3]/a")).click();
		System.out.println("4 Logged out");
		driver.close();
		System.out.println("5 Browser closed");*/
		/*----------------------------------------------------------------------------------------------------------------------*/
		System.out.println();
		System.out.println("Find friends");
		driver.findElement(By.xpath("//div[@id='subnav']/ul[1]/li[5]/a")).click();
		driver.findElement(By.xpath("//div[@id='social_con']/div/ul/li[1]/a[2]")).click();
		Class<? extends Window> classn = driver.manage().window().getClass();
		System.out.println(classn);
		driver.manage().window().setSize(null);
		
		
	}
}
