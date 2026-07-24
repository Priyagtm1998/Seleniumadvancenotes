package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement Country=driver.findElement(By.id("country"));
		Select select =new Select(Country);
		//select.selectByIndex(3);
        //select.selectByValue("france");
		select.selectByVisibleText("Germany");
	}

}
