import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countoflinkxpath {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test() 
	{
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(WebElement li:linklist)
		{
			String url=li.getAttribute("href");
			verify(url);
		}
	}
	private void verify(String url) {
		
	try
		{
		URL u =new URL(url);
		HttpURLConnection con= (HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("success");
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("broken link");
		}

		} catch (IOException e) 
	{
			System.out.println(e.getMessage());	
	}
	}
	@After
	public void teardown()
	{
		//driver.close();
	}
}
