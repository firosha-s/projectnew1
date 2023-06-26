package testngprgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prgm4 {
	ChromeDriver driver;
	
	@BeforeTest()
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod()
	public void url()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void testing()
	{
		WebElement box=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		Boolean b=box.isSelected();
		if(b)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("pass");
		}
		WebElement file=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		file.sendKeys("C:\\Users\\FIROSHA S FATHIMA\\Documents\\Laundry.jpeg");
		WebElement check=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		check.click();
		Boolean b1=check.isEnabled();
		if(b1)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		submit.click();
		Boolean button=submit.isSelected();
		if(button)
		{
			System.out.println("clicked");
		}
		else
		{
			System.out.println("not clicked");
		}

	}
}
