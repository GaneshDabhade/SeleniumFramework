package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends BasePage{
	
	public Login(WebDriver driver) {
		super(driver);
	}

//	Element Locators
	private By uname = By.xpath("//input[@id='user-name']");
	private By pwd = By.xpath("//input[@id='password']");
	private By loginBtn = By.xpath("//input[@id='login-button']");
		
	public WebElement getUname() {
		return getElement(uname);
	}

	public WebElement getPwd() {
		return getElement(pwd);
	}

	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}	
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public HomePage doLogin(String userName, String password) {
		getUname().sendKeys(userName);
		getPwd().sendKeys(password);
		getLoginBtn().click();
		
		return getInstance(HomePage.class);
	}
	
}
