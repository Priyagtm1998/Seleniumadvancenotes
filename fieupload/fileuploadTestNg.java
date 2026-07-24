package fieupload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileuploadTestNg {
		WebDriver driver;
		
		@BeforeTest
		public void openBrowser()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void openUrl()
		{
			driver.get("https://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();
		}
        @Test
        public void fileuploading() throws InterruptedException
        {
        	WebElement upload=driver.findElement(By.id("uploadfile_0"));
        	upload.sendKeys("C:\\Users\\edure\\Desktop\\new.txt");
        	WebElement check=driver.findElement(By.id("terms"));
        	check.click();
        	WebElement submit=driver.findElement(By.id("submitbutton"));
        	submit.click();
        	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"res\"]/center")));
        	WebElement message=driver.findElement(By.xpath("//*[@id=\"res\"]/center"));
        	String text=message.getText();
        	System.out.println(text);
        	boolean value=message.isDisplayed();
        	Assert.assertTrue(value);
        }
//        @AfterMethod
//        public void close() {
//        	System.out.println("successfully uploaded");
//        }
//        @AfterTest
//        public void end()
//        {
//        	driver.close();
//        }
}
