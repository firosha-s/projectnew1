package testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prgm1Actions {
ChromeDriver driver;
public void setup()
{
	driver= new ChromeDriver();
	}
@BeforeMethod
public void url()
{
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
}
@Test
public void testing()
{
	WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
	Actions act=new Actions(driver);
	act.dragAndDrop(from,to).perform();
	String textTo = to.getText();
	if(textTo.equals("Dropped!"))
	{
		System.out.println("PASS: dropped to target as expected");
	}
	else 
	{
		System.out.println("FAIL: couldn't be dropped to target as expected");
	}

	
}
}
