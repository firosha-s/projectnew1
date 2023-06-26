import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
ChromeDriver driver;
@Before
public void setup()
{
	driver= new ChromeDriver();
	driver.get("https://register.rediff.com>register>register");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[text()='Check availablity']"));
	String ss=driver.getAttribute("value");
	if(actual.equals(ss))
	{
		System.out.println("test passed");
	}
	else
	
		System.out.println("test failed");
}
@After
	public void teardown() 
{
	driver.close();
}
}
