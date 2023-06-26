package testngprgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testpg1 {
	ChromeDriver driver;
	
	@BeforeSuite
	public void suite()
	{
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	System.out.println("browser opens");
	}
	
	@BeforeClass
	public void bclass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	System.out.println("url loading..");
	}
	@Test(enabled=false)
	public void a()
	{
	System.out.println("test 1");
	}
	@Test(dependsOnMethods="b",priority=1)
	public void c()
	{
		System.out.println("test 2");
	}
    @Test(invocationCount=3)
    public void b()
    {
    System.out.println("test 3");
    }
    @Test(alwaysRun=true)
    public void d()
    {
    System.out.println("test 4");
    }
    @AfterMethod
    public void aftermethod()
    {
    System.out.println("url closes..");
    }
    @AfterClass
    public void aclass()
    {
    	System.out.println("after class");
    }
    @AfterTest
    public void teardowm()
    {
    	driver.quit();
    System.out.println("browser closes");
    }
    @AfterSuite
    public void asuite()
    {
    System.out.println("after suite");
    }
	
	
}
