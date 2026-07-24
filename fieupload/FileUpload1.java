package fieupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\edure\\Desktop\\new.txt");

	}

}
