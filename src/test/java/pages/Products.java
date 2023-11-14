package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
	WebDriver driver;
	By addBackpackToCart = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
	By addTshirtToCart = By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']");
	By cartBtn = By.xpath("//a[@class='shopping_cart_link']");
	
		
	public Products(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addBackpackToCart() {
		driver.findElement(addBackpackToCart).click();
	}
	
	public void addToCart(String itemName) throws InterruptedException {
		// Locate element on products page and its "Add to cart" button.
		String itemXpathString = String.format("//div[text()='%s']", itemName);
		String parentDivXpath = String.format("%s/ancestor::div[@class='inventory_item']", itemXpathString);
		String addToCartBtnXpath = String.format("%s/descendant::button[text()='Add to cart']", parentDivXpath);
		
		driver.findElement(By.xpath(addToCartBtnXpath)).click();
	}
	
	public void clickOnCartBtn(){
		driver.findElement(cartBtn).click();
	}
	
	//div[text()='Sauce Labs Backpack']
}
