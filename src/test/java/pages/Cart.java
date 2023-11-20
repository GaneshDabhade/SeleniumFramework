package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	WebDriver driver;
	
	public By listCartItems = By.xpath("//div[@class='cart_item']");
	public By itemName = By.xpath("//div[@class=\"inventory_item_name\"]");
	
	public Cart(WebDriver driver) {
		this.driver = driver;
	}
	
	// List all cart items
	public List<WebElement> listCartItems() {
	 	List<WebElement> element = this.driver.findElements(listCartItems);
	 	return element;
	}
	
	// Verify provided item present in cart
	public void verifyCart(String itemName) {
//		String itemXpath = String.format(itemName, null)
	}
}
