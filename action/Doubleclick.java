package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	
	public static void main(String[] args) {
		 ChromeDriver driver =new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 //double click
		 WebElement doublee =driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 Actions act=new Actions(driver);
		 act.doubleClick(doublee).build().perform();
		 //right click----contextClick();
		 WebElement right=driver.findElement(By.id("PopUp"));
		 act.contextClick(right).build().perform();
		 
		 
		 
		 
		 
		 
	}

}
