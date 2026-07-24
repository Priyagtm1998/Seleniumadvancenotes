package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement confirmation=driver.findElement(By.id("confirmBtn"));
		confirmation.click();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();

	}

}
