package jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//scroll down
		js.executeScript("window.scrollBy(0,1000);");
		//scroll up
		js.executeScript("window.scrollBy(0,-500);");
		//scroll until element is visible
		WebElement load=driver.findElement(By.xpath("(//span[text()='Load Testing'])[2]"));
	
		//js.executeScript("arguments[0].scrollIntoView(true);",load);
		//load.click();
		//scroll to buttom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		

	}

}
