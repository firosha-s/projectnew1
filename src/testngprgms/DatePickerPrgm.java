package testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerPrgm {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@class='uitk-date-picker-month'][2]"));
			String month1=month.getText();
			if(month1.equals("August 2023"))
			{
			System.out.println(month1);
			break;
			}
		else
		{
			driver.findElement(By.xpath("//*[@class='uitjk-calendar']/div/button[2]")).click();
		}
		}
	}
}
