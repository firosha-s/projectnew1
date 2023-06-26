package testngprgms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	/*@Parameters("a")
	@Test
	public void test(String a)
	{
		System.out.println("value is: "+a);
	}*/
	@Parameters({"a","b"})
	@Test
	public void test(int a,int b)
	{
		int c=a+b;
		System.out.println("sum is: "+c);
	}
	

}
