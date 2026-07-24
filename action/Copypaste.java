package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copypaste {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 WebElement name=driver.findElement(By.id("name"));
		 name.sendKeys("abc");
		 WebElement email=driver.findElement(By.id("email"));
		 Actions act =new Actions(driver);
		 act.keyDown(name,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		 act.keyDown(email,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		 

	}

}
