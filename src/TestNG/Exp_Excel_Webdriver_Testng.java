package TestNG;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Workbook;

public class Exp_Excel_Webdriver_Testng {
	WebDriver driver;
	@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\sweeja\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	@Test
	public void Excel_Testng1()throws Exception{
		FileInputStream file=new FileInputStream("‪C:\\ReadExcel.xlsx");
		Workbook wb=Workbook.getWorkbook(file);
		jxl.Sheet st=wb.getSheet(0);
		int i=1;
		String un=st.getCell(0, i).getContents();
		String pw= st.getCell(1, i).getContents();
		Reporter.log(un);
		Reporter.log(pw);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("application opened");
		Thread.sleep(3000);
		Reporter.log(driver.getTitle());
		driver.findElement(By.name("txtUsername")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Reporter.log("login completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Reporter.log("Logout completed");
		
		
		
		
		
	}

}
