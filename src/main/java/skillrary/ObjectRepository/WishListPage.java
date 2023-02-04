package skillrary.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	@FindBy(xpath="//a[@class=\"close_cookies\"]")
	private WebElement cookies;
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishList;
	
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	public void closeCookies() {
		cookies.click();
	}
	public void playButton() {
		playbtn.click();
	}
	public void pauseButton() {
		pausebtn.click();
	}
	public void wishList() {
		wishList.click();
	}


}
