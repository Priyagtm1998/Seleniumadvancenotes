package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTestNg {
	WebDriver driver;
	
	@BeforeTest
	public void callbrowser()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void openurl()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyemail()
	{
		WebElement email=driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		email.sendKeys("gautham23@gmail.com");
		
	}
    @Test
    public void verifypassword()
    {
    	WebElement pass=driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
    	pass.sendKeys("priya@123");
    }
    @Test
    public void verifylogin() throws InterruptedException
    {
    	Thread.sleep(2000);
    	WebElement login=driver.findElement(By.xpath("//span[text()='Log in']"));
    	login.click();
    }
    @AfterMethod
    public void close()
    {
    	System.out.println("close");
    }
    @AfterTest
    public void closeall()
    {
    	driver.close();
    }
}
