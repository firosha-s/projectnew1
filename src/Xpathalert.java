import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathalert {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/FIROSHA%20S%20FATHIMA/Desktop/.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		if(s.equals("Hello! I am alert box!!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		System.out.println("alert accepted");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("firosha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("fathima");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	@After
	public void teardown()
	{
		//driver.close();
	}

}
