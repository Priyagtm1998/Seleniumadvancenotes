package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NEW1 {

	public static void main(String[] args) {
            ChromeDriver driver=new ChromeDriver();
           // driver.get("https://chatgpt.com/");
            driver.get("https://testautomationpractice.blogspot.com/");
            
//            String currenturl=driver.getCurrentUrl();
//            System.out.println(currenturl);
//            String AcTitle=driver.getTitle();
//            System.out.println(AcTitle);
//            String ExTitle="CHATGPT";
//            if(ExTitle.equalsIgnoreCase(AcTitle))
//            {
//            	System.out.println("pass");
//            }
//            else {
//            	System.out.println("fail");
//            }
            WebElement drop=driver.findElement(By.id("country"));
            Select select=new Select(drop);
            select.selectByIndex(3);
            select.selectByValue("france");
            select.selectByVisibleText("Japan");
            
	}

}
