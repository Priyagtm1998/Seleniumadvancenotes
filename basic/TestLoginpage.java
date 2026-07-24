package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginpage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hi");
		Thread.sleep(9000);
		driver.findElement(By.id("username")).clear();
		//driver.findElement(By.id("password")).sendKeys("Password123");
		//driver.findElement(By.id("submit")).click();
		//driver.findElement(By.linkText("Log out")).click();
		

	}

}
