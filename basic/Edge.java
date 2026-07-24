package basic;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();
		//driver.quit();

	}

}
