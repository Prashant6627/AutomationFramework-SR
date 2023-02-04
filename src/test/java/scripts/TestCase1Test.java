package scripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import skillrary.GenericUtility.BaseClass;
import skillrary.GenericUtility.ListenersImplementationClass;
import skillrary.ObjectRepository.AddToCartPage;
import skillrary.ObjectRepository.HomePage;
import skillrary.ObjectRepository.SkillraryDemoAppPage;


@Listeners(ListenersImplementationClass.class)
public class TestCase1Test extends BaseClass{
	
	@Test(groups = "RegressionSuite")
	public void tc1() {
		HomePage s=new HomePage(driver);
		s.gearsButton();
		s.skillraryDemoAppcication();
		
		wUtil.switchToWindow(driver);
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
		wUtil.mouseHover(driver, sd.getCourseTab());
		sd.seleniumTrainingTab();
		
		AddToCartPage a = new AddToCartPage(driver);
		wUtil.doubleClickoN(driver, a.getAddButton());
		a.addToCartButton();
		wUtil.alertPopupAccept(driver);
		
		Reporter.log("TestCase1 executed successfully",true);
	}
	@Test(groups ="SmokeSuite")
	public void demo1() {
		Reporter.log("TestCase1 Smoke",true);
	}
	@Test(groups ="RegressionSuite")
	public void demo2() {
		Reporter.log("TestCase1 Regression",true);
	}
	@Test
	public void demo3() {
		Reporter.log("TestCase1 NoSmoke-NoRegression",true);
	}
	@Test
	public void demo4() {
		Reporter.log("TestCase1 RegionalRegression",true);
	}


}
