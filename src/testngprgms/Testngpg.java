package testngprgms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpg {
	
	
	
	@BeforeTest
	public void setup()
	{
	System.out.println("browser opens");
	}
	
	@BeforeMethod
	public void urlloading()
	{
	System.out.println("url loading..");
	}
	@Test
	public void test1()
	{
	System.out.println("test 1");
	}
    @Test
    public void test2()
    {
    System.out.println("test 2");
    }
    @AfterMethod
    public void aftermethod()
    {
    System.out.println("url closes..");
    }
    @AfterTest
    public void aftertest()
    {
    System.out.println("browser closes");
    }
}
