package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Wd_TestNg {
	WebDriver driver;
	@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\sweeja\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void tc001() throws Exception {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Reporter.log("Application opened");
		Reporter.log(driver.getTitle());
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");//console.java
		Reporter.log("login completed");//HTML report testng
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Reporter.log("Logout completed");
	}
	
}
