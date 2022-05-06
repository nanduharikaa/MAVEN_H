package Com.Pac;

	import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	public class Login_To_Vtiger { 
		@Test
		public static void Login() throws Throwable {
			System.setProperty("webdriver.chrome.driver","D:\\KCSM12\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

}
}