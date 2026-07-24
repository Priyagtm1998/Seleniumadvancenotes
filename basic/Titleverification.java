package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("hello");
		driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys("hi");
		String ExpectedTitle="Facebook";
		String ActualTitle=driver.getTitle();
		if(ExpectedTitle.equalsIgnoreCase(ActualTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
