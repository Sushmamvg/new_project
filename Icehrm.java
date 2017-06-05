package DoneDone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Icehrm {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://icehrm.com/app/deuglo/login.php?login=no");
		driver.findElement(By.id("username")).sendKeys("sushma");
		driver.findElement(By.id("password")).sendKeys("xhTGrl");
		driver.findElement(By.xpath("//form[@id='loginForm']/fieldset/button")).click();
		driver.findElement(By.xpath("//a[@id='atteandanceLink']")).click();
		
		String atitle = driver.getTitle();
		String etitle = "ICE Hrm";
		Assert.assertEquals(atitle, etitle);
		System.out.println("title of the page:" + atitle);
		

		driver.findElement(By.xpath("//button[@id='punchButton']")).click();
		
		driver.findElement(By.xpath("//form[@id='Attendance_submit']/div/div[4]/div[1]/button[1]")).click();

		System.out.println("Punchin done.........");
		
		driver.findElement(By.xpath("//button[@id='punchButton']")).click();
		driver.findElement(By.xpath("//form[@id='Attendance_submit']/div/div[4]/div[1]/button[1]")).click();
		
		System.out.println("Punchout done.................");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header[@id='delegationDiv']/nav/div[2]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		System.out.println("Bye byeeeeeeee....................");
		driver.close();
		
		
		
		}
} 