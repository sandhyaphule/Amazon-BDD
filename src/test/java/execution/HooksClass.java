package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driverfactory.LaunchBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass 
{

	WebDriver driver ;
	@Before
	public void launchbrowser()
	{
		//open browser
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		
	}
	@After
	public void closebrowser() throws InterruptedException
	{
//		Thread.sleep(5000);
//		driver.quit();
	}
 
}
