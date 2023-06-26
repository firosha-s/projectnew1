package pomprojecttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomprojectpage.Registrationpage;

public class Registrationtest{

		WebDriver driver;
		@BeforeTest
		public void url()
		{
			driver=new ChromeDriver();
			driver.get("https://www.vivaah.com/my_profile/register-create-profile.php");
		}
	
	@Test
	public void registrationtest()
	{
		Registrationpage  rp= new Registrationpage(driver);
		rp.Accountinfo("testersha97@gmail.com","abcd1234");
		rp.Basicinfo("aisha fathima");
		rp.BasicinfoDropDown();
		rp.contactinfoDropDown();
		rp.contactinfo("1234567890");
		rp.registerbutton();
		
	}

}
