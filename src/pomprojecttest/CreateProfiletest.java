package pomprojecttest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomprojectpage.CreateProfilepage;

public class CreateProfiletest  {
	WebDriver driver;
	@BeforeTest
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vivaah.com/my_profile/register-create-profile.php");
	}
	
	@Test
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
