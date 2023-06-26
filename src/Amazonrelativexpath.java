import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonrelativexpath {
	
	ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
@Test
public void locatorxpath()
{
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("phone");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.navigate().back();
driver.navigate().back();
}
@After
public void teardown()
{
	//driver.close();
}
}



