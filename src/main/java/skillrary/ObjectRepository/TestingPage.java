package skillrary.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(id="Selenium Training")
	private WebElement seleniumTraining;
	
	@FindBy(id="cartArea")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class=\"fa fa-facebook\"])[2]")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSeleniumTraining() {
		return seleniumTraining;
	}

	public WebElement getCart() {
		return cart;
	}
	
	public WebElement getFacebook() {
		return facebook;
	}

	public void facebookIcon() {
		facebook.click();
	}

}
