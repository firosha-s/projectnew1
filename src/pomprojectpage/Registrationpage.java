package pomprojectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage {

	WebDriver driver;
	By vemailaddress = By.id("mememailid");
	By vpassword = By.name("password1");
	By vusername = By.name("fullname");
	By vgender = By.xpath("//*[@id=\"sex\"]");
	By vday = By.xpath("//*[@id=\"dday\"]");
	By vmonth = By.xpath("//*[@id=\"dmonth\"]");
	By vyear = By.xpath("//*[@id=\"dobgrp\"]/div/select[3]");
	By vcountry = By.xpath("//*[@id=\"countrylive\"]");
	By vreligion = By.xpath("//*[@id=\"religion\"]");
	By vcountrycode = By.xpath("//*[@id=\"countrycodeid\"]");
	By vphonenumber = By.name("phno");
	By vregister = By.name("submit");
	
	public Registrationpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Accountinfo(String emailaddress,String password)
	{
		driver.findElement(vemailaddress).sendKeys(emailaddress);
		driver.findElement(vpassword).sendKeys(password);
	}
	public void Basicinfo(String username) 
	{
		driver.findElement(vusername).sendKeys(username);
	}
	public void BasicinfoDropDown()
	{
		WebElement gender=driver.findElement(vgender);
		Select g=new Select(gender);
		g.selectByValue("1");
		WebElement day=driver.findElement(vday);
		Select d=new Select(day);
		d.selectByValue("13");
        WebElement month=driver.findElement(vmonth);
        Select m=new Select(month);
		m.selectByValue("8");
        WebElement year=driver.findElement(vyear);
		Select y=new Select(year);
		y.selectByValue("1997");
		WebElement country=driver.findElement(vcountry);
		Select c=new Select(country);
		c.selectByValue("2");
		WebElement religion=driver.findElement(vreligion);
		Select r=new Select(religion);
		r.selectByValue("230");

	}
	public void contactinfoDropDown()
	{
		WebElement countrycode=driver.findElement(vcountrycode);
		Select cc=new Select(countrycode);
		cc.selectByValue("2");

	}
	public void contactinfo(String phonenumber)
	{
		driver.findElement(vphonenumber).sendKeys(phonenumber);
	}
	public void registerbutton()
	{
		driver.findElement(vregister).click();
	}
	
}
