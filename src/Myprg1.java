import org.openqa.selenium.chrome.ChromeDriver;

public class Myprg1 {

	public static void main(String[] args) {
		String expectedtitle="Instagram";
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.instagram.com");
		
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.close();
	}

}
