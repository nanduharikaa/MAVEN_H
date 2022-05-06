package Com.Pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_To_Facebook {
	@Test
	public static void Login() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\KCSM12\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

}
}