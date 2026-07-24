package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	    Thread.sleep(2000);
		
		
		WebElement logo=driver.findElement(By.id("imagetrgt"));
		
		boolean value=logo.isDisplayed();
		if(value==true) {
			System.out.println("Pass");
		}else
		{
			System.out.println("fail");
		}
		
		

	}

}
