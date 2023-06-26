
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittitle {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void test1()
	{
		
		String expected="Google";
		String actual=driver.getTitle();
		if(actual.equals(expected))
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
