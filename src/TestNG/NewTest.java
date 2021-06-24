package TestNG;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void login()  {
	 
	  System.out.println("Login completed");
  }
  @Test
  public void Logout() {
	  System.out.println("Logout completed");
  }
  @Test
  public void addemp() {
	  System.out.println("Employee added");
  }
  @Test
  public void delemp() {
	  System.out.println("deleted emp");
  }
}
