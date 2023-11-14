package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		Login(driver);
	}
	
	public static void Login(WebDriver driver) {
		driver.get("https://www.saucedemo.com/");		
		Login login = new Login(driver);
		login.enterUserName("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLoginBtn();
	}
}
