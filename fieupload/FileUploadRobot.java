package fieupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobot {

	public static void main(String[] args) throws AWTException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		//STORE FILE LOCATION
		StringSelection s=new StringSelection("C:\\Users\\edure\\Downloads\\Get_Started_With_Smallpdf.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//clipboard copy
		
		driver.findElement(By.id("pickfiles")).click();
		Robot r=new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		


	}

}
