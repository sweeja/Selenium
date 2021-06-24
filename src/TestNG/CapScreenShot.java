package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.ltgfmt.impl.TestCaseImpl.FilesImpl;

import jxl.biff.Type;

import java.io.File;
import java.io.IOException;



public class CapScreenShot {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\sweeja\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterMethod
	public void tearDown() throws Exception {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void screenshot() throws Exception {
		{
			try {
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				driver.findElement(By.name("txtUserName")).sendKeys("suresh");
				driver.findElement(By.name("txtPassword")).sendKeys("suresh123");
				driver.findElement(By.name("Submit")).click();
				Thread.sleep(3000);
				WebElement element = driver.findElement(By.linkText("PIM"));
				Actions action = new Actions(driver);
				action.moveToElement(element).perform();
				Thread.sleep(3000L);
				driver.findElement(By.linkText("Add Employee")).click();
				Thread.sleep(4000);
				System.out.println("Clicked on submenu");
				}	catch(Exception e)
			{
				File F1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(F1,new File("C:\\log\\sweeja.png"));
			
			}
			driver.close();
		}
	}
}
	
	
		
		
	
