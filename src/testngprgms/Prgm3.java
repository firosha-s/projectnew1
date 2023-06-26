package testngprgms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prgm3 {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void testing()
	{
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//*[contains(text(),'right click me')]"));
		action.contextClick(rightclick).perform();
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li/span"));
		edit.click();
		Alert a = driver.switchTo().alert();
		String alert1txt=a.getText();
		System.out.println("alert1txt");
		a.accept();
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		action.doubleClick(doubleclick).perform();
		Alert a1 = driver.switchTo().alert();
		String alert2txt=a.getText();
		System.out.println("alert2txt");
		a1.accept();
		
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*contains[text()'right click me']")));
		


	}

}
