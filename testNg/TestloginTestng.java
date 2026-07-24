package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestloginTestng {
          	WebDriver driver;
          	
          	
      @BeforeTest
      public void openbrowser()
      {
    	  driver=new ChromeDriver();
          
      }
      @BeforeMethod
      public void openurl()
      {
    	  driver.get("https://practicetestautomation.com/practice-test-login/");
    	  driver.manage().window().maximize();
      }
      @Test(priority=1,invocationCount=2)
      public void verifyTitle()
      {
    	 String actualtitle=driver.getTitle();
    	 String expectedtitle="Test Login | Practice Test Automation";
    	 Assert.assertEquals(actualtitle, expectedtitle);
      }
      @Test
      public void loginWithValidCredential()
      {
    	  WebElement username=driver.findElement(By.id("username"));
    	  username.sendKeys("student");
    	  WebElement pass=driver.findElement(By.id("password"));
    	  pass.sendKeys("Password123");
    	  WebElement submit=driver.findElement(By.id("submit"));
    	  submit.click();
    	  WebElement logged=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
    	  boolean value=logged.isDisplayed();
    	  Assert.assertTrue(value);
      }
      @Test 
      public void loginWithInvalidCredential()
      {
    	  WebElement username=driver.findElement(By.id("username"));
    	  username.sendKeys("student12");
    	  WebElement pass=driver.findElement(By.id("password"));
    	  pass.sendKeys("Password123");
    	  WebElement submit=driver.findElement(By.id("submit"));
    	  submit.click();
    	  WebElement invalid=driver.findElement(By.id("error"));
    	  boolean value1=invalid.isDisplayed();
    	  System.out.println(value1);  
    	  Assert.assertTrue(value1);    
      }
      @Test
      public void verifySubmitButton()
      {
    	  WebElement submit=driver.findElement(By.id("submit"));
    	  boolean value=submit.isEnabled();
    	  Assert.assertTrue(value);
      }
      @AfterMethod
      public void close()
      {
    	  System.out.println("close");
      }
     
      @AfterTest
      public void end()
      {
    	  driver.close();
      }
}
