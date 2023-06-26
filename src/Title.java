import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		
		String expectedtitle="Google";
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.quit();//to close all the windows
		//driver.close();//in case of multiple close current window
	}

}
