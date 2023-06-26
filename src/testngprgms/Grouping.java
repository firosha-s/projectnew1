package testngprgms;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"sanity","regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(groups={"regression"})
	public void test4()
	{
		System.out.println("test4");
	}

}
