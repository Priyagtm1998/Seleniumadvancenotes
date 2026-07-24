package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1 {
    @BeforeTest
    public void setup()
    {
    	System.out.println("open broswer");
    	
    }
    @BeforeMethod
    public void url()
    {
    	System.out.println("open url");
    }
    @Test
    public void verifyTest()
    {
    	System.out.println("Test1");
    }
    @Test
    public void verifytitle()
    {
    	System.out.println("test2");
    }
    
    @AfterMethod
    public void closeurl()
    {
    	System.out.println("close");
    }
    @AfterTest
    public void closeall()
    {
    	System.out.println("closeall");
    }
}
