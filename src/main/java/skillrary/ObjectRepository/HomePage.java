package skillrary.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement searchButton;
	
	@FindBy(xpath="//a[text()='CATEGORIES']")
	private WebElement categoriesTab;
	
	@FindBy(xpath="//ul[@class=\"dropdown-menu mCustomScrollbar\"]//li/a")
	private List<WebElement> list;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void gearsButton()
	{
		gearsBtn.click();
	}
	public void skillraryDemoAppcication() {
		skillraryDemoApp.click();
	}
	public void searchTextBox(String name) {
		searchtb.sendKeys(name);
	}
	public void searchButton() {
		searchButton.click();
	}
	public void categories() {
		categoriesTab.click();
	}
	public List<WebElement> getList() {
		return list;
	}

}
