package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TC002 {
 
  @BeforeClass
  public void login(){
	  System.out.println("login completed");
  }

  @AfterClass
  public void logout(){
	  System.out.println("logout completed");
  }
  @Test(priority=2)
  public void addemp() {
  System.out.println("Adding new emp");
  }
  @Test(priority=1)
  public void delemp() {
  System.out.println("delete emp");
  }

}
