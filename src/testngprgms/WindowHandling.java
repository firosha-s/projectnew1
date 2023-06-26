package testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	@Test
	public void test() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		String parenntWindow=driver.getWindowHandle();
		System.out.println("parent title ="+.getTitle());
		driver.findElement(By.xpath("/html/body/p/a"));
		set<String>allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
					{
				
					}
		}
	}

}
