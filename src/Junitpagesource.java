import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpagesource {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void pageTest()
	{
		
		String s=driver.getPageSource();
		if(s.contains("Gmail"))
		//if(s.contains("firo"))
		
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	}
	@After
	public void teardown()
	{
		driver.close();
	}

}
