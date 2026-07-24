package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitywait1 {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	 WebElement forget=driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[4]/div/a/div/div[1]/div/span/span"));
	 forget.click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     WebElement user=driver.findElement(By.xpath("//*[@id=\"_r_2_\"]"));
     user.sendKeys("hii");
	}

}
