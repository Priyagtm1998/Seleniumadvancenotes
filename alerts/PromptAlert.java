package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement prompt=driver.findElement(By.id("promptBtn"));
		prompt.click();
		driver.switchTo().alert().sendKeys("hii");
		driver.switchTo().alert().accept();

	}

}
