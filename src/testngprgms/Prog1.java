package testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prog1 {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void radio()
	{
		WebElement rbutton=driver.findElement(By.xpath("//input[@value='m']"));
		Boolean b=rbutton.isSelected();
		if(b)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
	@Test
	public void logo()
	{
		WebElement logo=driver.findElement(By.xpath("//img[@src='/register/pix/redifflogo1.gif']"));
		Boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		
		
	}
	@Test
	public void button()
	{
		WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
		Boolean b=button.isEnabled();
		if(b)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
	
	}
}
