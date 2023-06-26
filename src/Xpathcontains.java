import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontains {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void locatorid()
	{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("firo@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("firosha");
	driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
	}
	@After
	public void teardown()
	{
		//driver.close();
	}
}
