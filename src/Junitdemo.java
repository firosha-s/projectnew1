import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemo {
	@Before
	public void setup()
	{
		System.out.println("browser opens");
	}
	@Test
	public void test1()
	{
		System.out.println("test details");
	}
	@After
	public void teardown()
	{
		System.out.println("browser closes");
	}
}
