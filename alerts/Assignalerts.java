package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignalerts {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
//		WebElement simple=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		simple.click();
//		driver.switchTo().alert().accept();
		
//		WebElement confirmation=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		confirmation.click();
//        WebElement next=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//        next.click();
//        driver.switchTo().alert().accept();
        WebElement prompt=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
        prompt.click();
        WebElement pro=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        pro.click();
        driver.switchTo().alert().sendKeys("good");
        driver.switchTo().alert().accept();
	}

}
