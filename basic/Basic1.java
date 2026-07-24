package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		 String title=driver.getTitle();
		 System.out.println(title);
		 String currenturl=driver.getCurrentUrl();
		 System.out.println(currenturl);
		 
		 driver.findElement(By.partialLinkText("Forgotten ")).click();
		// driver.quit();
		// driver.close();
		 


	}

}
