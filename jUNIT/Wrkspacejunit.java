package jUNIT;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrkspacejunit {

	
		WebDriver driver;
		
	   @Before
		public void url()
		{
		   driver=new ChromeDriver();
		   driver.get("https://edure.in/");
		   driver.manage().window().maximize();
		   
		}
	   
	   @Test
	    public void verifylogo() throws InterruptedException
	    {
		   WebElement num=driver.findElement(By.xpath("//img[@class='custom-logo']"));
		  // num.click();
		   Thread.sleep(2000);
		   boolean value=num.isDisplayed();
		   System.out.println(value);
		   
	    }
        @Test
        public void verifyhome() throws InterruptedException
        {
        	
        	Thread.sleep(4000);
        	WebElement home=driver.findElement(By.xpath("(//span[@class='text-wrap'])[2]"));
        	home.click();
        	
        }
        @Test
        public void verifystart()
        {
        	WebElement start =driver.findElement(By.xpath("(//span[@class='text-wrap'])[8]"));
        	start.click();
        }
        
        @After
        public void verifyclose()
        {
        	driver.close();
        }
	}
