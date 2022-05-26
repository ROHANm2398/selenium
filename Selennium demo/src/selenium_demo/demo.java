package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software meth\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
driver.manage().window().maximize();
driver.findElement(By.id("firstName")).sendKeys("Rohan");
driver.findElement(By.id("lastName")).sendKeys("Mandavkar");
driver.findElement(By.id("username")).sendKeys("rmandavkar0002");
driver.findElement(By.name("Passwd")).sendKeys("rohan2398@");
driver.findElement(By.name("ConfirmPasswd")).sendKeys("rohan2398@");
driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//driver.findElement(By.name("phoneNumberId")).sendKeys("1234567890");
//driver.findElement(By.name("recoveryEmail")).sendKeys("rmandavkar98@gmail.com");
//driver.findElement(By.id("month")).Value("2");



//driver.findElement(By.className("VfPpkd-vQzf8d")).click();
String at=driver.getTitle();

String et="Create your Google Account";
driver.close();
if(at.equalsIgnoreCase(et))
{
	System.out.println("Test succesful");
}
else
{
	System.out.println("test has failed");
}
		
		
	}

}
