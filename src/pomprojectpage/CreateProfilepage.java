package pomprojectpage;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateProfilepage {
	
	WebDriver driver;
	
	By relationshipToProfile = By.xpath("//*[@id=\"prof_edit_relationtoprofileid\"]");
	By maritalStatus = By.xpath("//*[@id=\"prof_edit_maritalstatusid\"]");
	By haveChildren = By.xpath("//*[@id=\"prof_edit_haschildrenid\"]");
	By height = By.xpath("//*[@id=\"prof_edit_heightid\"]");
	By bodyType = By.xpath("//*[@id=\"prof_edit_bodytypeid\"]");
	By complexion= By.xpath("//*[@id=\"prof_edit_complexionid\"]");
	By familyValues = By.xpath("//*[@id=\"prof_edit_cultvaliuesid\"]");
	By smoke = By.xpath("//*[@id=\"prof_edit_smokeid\"]");
	By drink = By.xpath("//*[@id=\"prof_edit_drinkid\"]");
	By diet = By.xpath("//*[@id=\"prof_edit_dietid\"]");
	By specialCase = By.xpath("//*[@id=\"prof_edit_specialcaseid\"]");
	By bloodGroup = By.xpath("//*[@id=\"prof_edit_bloodgroupid\"]");
	By state = By.xpath("//*[@id=\"prof_edit_stateid\"]");
	By city = By.xpath("//*[@id=\"prof_edit_indiancityid\"]");
	By residencyStatus = By.xpath("//*[@id=\"prof_edit_residencyid\"]");
	By motherTongue= By.xpath("//*[@id=\"prof_edit_mtoungeid\"]");
	By caste= By.xpath("//*[@id=\"prof_edit_casteid\"]");
	By timeOfBirth= By.xpath("//*[@id=\"prof_edit_timeofbirth\"]");
	By countryOfBirth= By.xpath("//*[@id=\"prof_edit_countryborn\"]");
	By cityOfBirth= By.xpath("//*[@id=\"prof_edit_placeofbirth\"]");
	By areyouManglik= By.xpath("//*[@id=\"prof_edit_manglikid\"]");
	By educationLevel= By.xpath("//*[@id=\"prof_edit_edulvlid\"]");
	By educationfield = By.xpath("//*[@id=\"prof_edit_edufieldid\"]");
	By educationDescription= By.xpath("//*[@id=\"prof_edit_edudesc\"]");
	By occupation= By.xpath("//*[@id=\"prof_edit_occupationid\"]");
	By occupationDescription= By.xpath("//*[@id=\"prof_edit_occupationdesc\"]");
	By annualIncome= By.xpath("//*[@id=\"prof_edit_incomeid\"]");
	By aboutYourselfFamily= By.xpath("//*[@id=\"prof_edit_aboutu\"]");
	By aboutIdealPatner= By.xpath("//*[@id=\"frm_edit_profile\"]/div[39]/div/textarea");
	By updateProfile=By.xpath("//*[@id=\"prof_edit_submit\"]");

	public CreateProfilepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void BasicDetails()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(relationshipToProfile));
		WebElement relation=driver.findElement(relationshipToProfile);
		Select r=new Select(relation);
		r.selectByValue("2");
		WebElement marital=driver.findElement(maritalStatus);
		Select ms=new Select(marital);
		ms.selectByValue("1");
		WebElement children=driver.findElement(haveChildren);
		Select child=new Select(children);
		child.selectByValue("1");
		WebElement height1=driver.findElement(height);
		Select h=new Select(height1);
		h.selectByValue("11");
		WebElement type=driver.findElement(bodyType);
		Select bt=new Select(type);
		bt.selectByValue("4");
		WebElement color=driver.findElement(complexion);
		Select c=new Select(color);
		c.selectByValue("3");
		WebElement family=driver.findElement(familyValues);
		Select fv=new Select(family);
		fv.selectByValue("2");
		WebElement smoking =driver.findElement(smoke);
		Select s=new Select(smoking);
		s.selectByValue("2");
		WebElement drinking=driver.findElement(drink);
		Select d=new Select(drinking);
		d.selectByValue("2");
		WebElement dieting=driver.findElement(diet);
		Select d1=new Select(dieting);
		d1.selectByValue("1");
		WebElement special=driver.findElement(specialCase);
		Select sc=new Select(special);
		sc.selectByValue("10");
		WebElement blood=driver.findElement(bloodGroup);
		Select bg =new Select(blood);
		bg.selectByValue("70");
		}
	public void Location()
	{
		WebElement states =driver.findElement(state);
		Select state1 =new Select(states);
		state1.selectByValue("2180");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(city));
		WebElement cities=driver.findElement(city);
		Select city1 =new Select(cities);
		city1.selectByValue("18693");
		WebElement residency=driver.findElement(residencyStatus);
		Select rs=new Select(residency);
		rs.selectByValue("2");
		}
	public void SocialBackgroundDropDown()
	{
		WebElement language=driver.findElement(motherTongue);
		Select mt=new Select(language);
		mt.selectByValue("30");
		WebElement caste1=driver.findElement(caste);
		Select c1=new Select(caste1);
		c1.selectByValue("29999");
	}
	public void SocialBackgroud(String time)
	{
		driver.findElement(timeOfBirth).sendKeys(time);
	}
	public void SocialBackgroundDropDown1()
	{
		WebElement countrybirth =driver.findElement(countryOfBirth);
		Select cbirth=new Select(countrybirth);
		cbirth.selectByValue("2");
	}
	public void SocialBackgroud1(String city)
	{
		driver.findElement(cityOfBirth).sendKeys(city);
	}
	public void SocialBackgroundDropDown2()
	{
		WebElement manglik =driver.findElement(areyouManglik);
		Select youmanglik=new Select(manglik);
		youmanglik.selectByValue("3");
	}
	public void EducationCareerDropDown()
	{
	WebElement education=driver.findElement(educationLevel);
	Select el=new Select(education);
	el.selectByValue("4");
	WebElement field=driver.findElement(educationfield);
	Select efield =new Select(field);
	efield.selectByValue("9");
	}
	public void EducationCareer(String edescription)
	{
		driver.findElement(educationDescription).sendKeys(edescription);
	}
	public void EducationCareerDropDown1()
	{
	WebElement occup=driver.findElement(occupation);
	Select op =new Select(occup);
	op.selectByValue("24");
	}
	public void EducationCareer1(String odescription)
	{
		driver.findElement(occupationDescription).sendKeys(odescription);
	}
	public void EducationCareerDropDown2()
	{
	WebElement income=driver.findElement(annualIncome);
	Select ai=new Select(income);
	ai.selectByValue("7");
	}
	public void aboutYourselfPatner(String familydescription,String patnerdescription)
	{
		driver.findElement(aboutYourselfFamily).sendKeys(familydescription);
		driver.findElement(aboutIdealPatner).sendKeys(patnerdescription);
	}
	public void updatebutton()
	{
		driver.findElement(updateProfile).click();
	}
}
