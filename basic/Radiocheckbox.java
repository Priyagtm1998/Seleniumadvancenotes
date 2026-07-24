package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiocheckbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		 
		//WebElement radio=driver.findElement(By.linkText(" Male"));
	   
		WebElement check=driver.findElement(By.id("checkbox3"));
		boolean value=check.isSelected();
		if(value==true)
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
	

	}

}
