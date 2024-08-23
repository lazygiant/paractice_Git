package para_DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	@org.testng.annotations.Test
	public void demoTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://youtube.com");
	}
}
