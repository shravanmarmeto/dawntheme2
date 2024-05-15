package dawnObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pdpPage {
	public pdpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='product__title']")
	private WebElement productTitle;
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getProductTitle() {
		return productTitle;
	}
}
