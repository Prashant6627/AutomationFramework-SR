package skillrary.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppPage {
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumTrainingTab;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourseTab() {
		return courseTab;
	}
	public void seleniumTrainingTab() {
		seleniumTrainingTab.click();
	}

	public WebElement getCoursedd() {
		return coursedd;
	}

}
