import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.get("https://www.facebook.com");
}
@Test
public void test() throws IOException
{
	//whole page screenshot
	
	File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(file1,new File("E://Screenshot.png"));
	
	//only a particular element
	
	WebElement button=driver.findElement(By.name("login"));
	File f =button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(f,new File("E://Screenshot.png"));
	
	//to save in working space
	FileHandler.copy(f,new File("./Screenshot//error.png"));
}
@After
public void teardown()
{
	//driver.close();
}
}
