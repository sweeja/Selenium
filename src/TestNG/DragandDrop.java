package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
@Test
public void testDragandDrop() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\sweeja\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://jqueryui.com/droppable/");
	Thread.sleep(100000L);
	assertEquals("Droppable|jQuery UI",d.getTitle());
d.switchTo().frame(0);
	Actions a= new Actions(d);
	a.dragAndDrop(d.findElement(By.id("draggable")),
d.findElement(By.id("droppable"))).perform();
	Thread.sleep(2000L);
	d.close();
	
	
	
	
}
}
