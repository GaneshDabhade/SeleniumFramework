package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
//	Element Locators
	By uname = By.xpath("//input[@id='user-name']");
	By pwd = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");
	
	public void enterUserName(String uName) {
		driver.findElement(uname).sendKeys(uName);
	}
	
	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
}
