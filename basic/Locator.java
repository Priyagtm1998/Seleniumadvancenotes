package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("form-control")).sendKeys("GAUTHAM");
		driver.findElement(By.id("email")).sendKeys("gautham12@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9074655455");
		driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("kovilakam kandiyoor");
		driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"friday\"]")).click();
		

	}

}
