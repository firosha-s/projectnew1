package test;

import org.testng.annotations.Test;

import pages.Fbcreatepage;

public class Fbcreatetest extends Baseclass{
		@Test
	public void Createpagetest()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.clickcreatepage();
		ob.getstartedbutton();
	}

}
