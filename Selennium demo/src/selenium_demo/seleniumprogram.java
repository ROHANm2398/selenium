package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumprogram {
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.chrome.driver","D:\\Software meth\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//URL 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.name("txtUsername")).click();
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.cssSelector("input.button")).click();
	
	driver.findElement(By.linkText("Admin")).click();
	
	driver.manage().window().maximize();
	//select
	Select dropdown=new Select(driver.findElement(By.id("searchSystemUser_userType")));
	WebElement checkbox=driver.findElement(By.id("ohrmList_chkSelectRecord_10"));
	checkbox.click();
	
	System.out.println("This is project on git hub");
	System.out.println("This is project on git hub");
	System.out.println("This is project on git hub");
	
	
}
}