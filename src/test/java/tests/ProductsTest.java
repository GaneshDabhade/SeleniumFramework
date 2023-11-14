package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Cart;
import pages.Products;

public class ProductsTest {
	WebDriver driver;
	Products products;
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		LoginTest.Login(driver);
		products = new Products(driver);
	}
	
	// Add Backpack to cart and verify in cart.	
	@Test
	public void addItemToCart() throws InterruptedException {
		products.addToCart("Sauce Labs Backpack");
	}
}
