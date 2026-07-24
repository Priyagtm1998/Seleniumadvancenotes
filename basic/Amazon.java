package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("(//li[@class='nav-li'])[4]")).click();
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("book");
//		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		driver.findElement(By.cssSelector("nav-line-2")).click();

	}

}
