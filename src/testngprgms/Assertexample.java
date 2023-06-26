package testngprgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertexample {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.google.com");
	}
	@Test
	public void testing()
	{
	    String actual=driver.getTitle();
	    System.out.println("actual title " +actual);
	    String expected="Google";
	    Assert.assertEquals(expected, actual);
	    System.out.println("hello");
	}

}
