package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
	WebElement submit=driver.findElement(By.id("submitbtn"));
	boolean value=submit.isEnabled();
	if(value==true) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}

	}

}
