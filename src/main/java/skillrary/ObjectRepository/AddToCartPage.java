package skillrary.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy(id="add")
	private WebElement addButton;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addToCartButton;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddButton() {
		return addButton;
	}
	
	public void addToCartButton() {
		addToCartButton.click();
	}

}
