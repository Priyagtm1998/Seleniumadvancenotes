package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitywait1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 WebElement forget=driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[4]/div/a/div/div[1]/div/span/span"));
		 forget.click();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"_r_2_\"]")));
		 
	     WebElement user=driver.findElement(By.xpath("//*[@id=\"_r_2_\"]"));
	     user.sendKeys("hii");

	}

}
