package selenium_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Software meth\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//url of testing website 
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("Rohan");
		driver.findElement(By.name("lastName")).sendKeys("mandavkar");
		driver.findElement(By.name("Username")).sendKeys("rmandavkar98888@gmail.com");
		driver.findElement(By.name("Passwd")).sendKeys("Rohan2398@");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Rohan2398@");
		driver.findElement(By.id("yDmH0d")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
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
				
		//driver.close();	
			}

	
}
