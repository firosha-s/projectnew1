package pomprojecttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomprojectpage.CreateProfilepage;
import pomprojectpage.Loginpage;

public class Logintest<CreateProfile> {
	WebDriver driver;
	@BeforeTest
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vivaah.com/indian_matrimonials/vivaah-login.php");
	}

	
	@Test
	public void testlogin()
	{
		Loginpage lp=new Loginpage(driver);
		lp.setvalue("testersha97@gmail.com","abcd1234");
		lp.login();
		CreateProfile();
		
	}
	public void CreateProfile()
	{
		CreateProfilepage cp=new CreateProfilepage(driver);
		cp.BasicDetails();
		cp.Location();
		cp.SocialBackgroundDropDown();
		cp.SocialBackgroud("12am");
		cp.SocialBackgroundDropDown1();
		cp.SocialBackgroud1("bengaluru");
		cp.SocialBackgroundDropDown2();
		cp.EducationCareerDropDown();
		cp.EducationCareer("mba");
		cp.EducationCareerDropDown1();
		cp.EducationCareer1("human resource");
		cp.EducationCareerDropDown2();
		cp.aboutYourselfPatner("good family", "good family");
		cp.updatebutton();
		}


}
