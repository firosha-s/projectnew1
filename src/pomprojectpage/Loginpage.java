package pomprojectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By login = By.xpath("/html/body/div[1]/div/div[2]/a[1]");
	By emailid = By.xpath("//*[@id=\"mememailid\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By loginbutton=By.xpath("//*[@id=\"loginnow\"]");
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalue(String email,String pass)
	{
		driver.findElement(emailid).sendKeys(email);
		driver.findElement(password).sendKeys(pass);
	}
	public void login()
	{
		driver.findElement(loginbutton).click();
	}

}
