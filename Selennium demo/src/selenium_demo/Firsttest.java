package selenium_demo;

import org.testng.annotations.Test;

public class Firsttest {
  @Test(priority=3)
  public void login() {
	  System.out.println("This is a login");
  }
  @Test(priority=5)
  public void logout() {
	  System.out.println("This is a logout");
  }
  @Test(priority=2)
  public void admin() {
	  System.out.println("This is a admin");
  }
  @Test(priority=1)
  public void welcome() {
	  System.out.println("This is a welcome");
  }
  @Test(priority=4)
  public void PIM() {
	  System.out.println("This is a PIM");
  }
}
