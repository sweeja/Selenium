package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverTest {
	WebDriver driver;
@BeforeClass
  public void Startup(){
	  @SuppressWarnings("unused")
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\sweeja\\chromedriver.exe");
	  driver = new ChromeDriver();
  }
	  @Test
	  public void login() throws Exception {
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.name("Submit")).click();
		  System.out.println("Login completed");
		  Reporter.log("Login completed");
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Logout")).click();
		  System.out.println("Logout completed");
	  }
	  
	

  @AfterClass
  public void teardown() {
	  driver.close();
  }

}
