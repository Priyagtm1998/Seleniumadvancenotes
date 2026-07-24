package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop1 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 WebElement value=driver.findElement(By.id("draggable"));
		 WebElement value2=driver.findElement(By.id("droppable"));
		 Actions act=new Actions(driver);
		 act.dragAndDrop(value, value2).perform();

	}

}
