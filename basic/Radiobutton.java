package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement radio=driver.findElement(By.id("female"));
		radio.click();
		System.out.println(radio.isSelected());
//		if (value==true)
//		{
//			System.out.println("pass");
//		}else
//		{
//			System.out.println("Fail");
//		}
		
	
	}

}
