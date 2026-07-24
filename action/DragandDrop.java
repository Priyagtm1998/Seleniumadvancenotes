package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

	    WebElement drag=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement drop=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(drag, drop).perform();
        
      //   WebElement value1=driver.findElement(By.xpath(null));
        
        
        
	}

}
