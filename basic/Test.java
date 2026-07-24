package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement gender=driver.findElement(By.xpath("//input[@id='female']"));
		gender.click();
		Thread.sleep(5000);
		boolean value=gender.isSelected();
		System.out.println(value);

	}

}
