package jUNIT;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittt {
	
	
	WebDriver driver;
	@Before
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyTitle()
	{
		String Actitle=driver.getTitle();
		System.out.println(Actitle);
		String expectedResult="Automation Testing Practice";
		System.out.println(expectedResult.equalsIgnoreCase(Actitle));			
	}
	
	@Test
	public void verifyGender() throws InterruptedException
	{
		WebElement gender=driver.findElement(By.xpath("//input[@id='female']"));
		gender.click();
		Thread.sleep(2000);
		System.out.println(gender.isSelected());
		
	}
	@After
	public void end()
	{
		driver.close();
	}
	
	
	

}
