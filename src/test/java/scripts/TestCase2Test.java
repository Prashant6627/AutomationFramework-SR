package scripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import skillrary.GenericUtility.BaseClass;
import skillrary.GenericUtility.ListenersImplementationClass;
import skillrary.ObjectRepository.HomePage;
import skillrary.ObjectRepository.SkillraryDemoAppPage;
import skillrary.ObjectRepository.TestingPage;


@Listeners(ListenersImplementationClass.class)
public class TestCase2Test extends BaseClass{
	
	@Test(groups = "SmokeSuite")
	public void tc2() throws IOException {
		HomePage s=new HomePage(driver);
		s.gearsButton();
		s.skillraryDemoAppcication();
		
		wUtil.switchToWindow(driver);
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);		
		wUtil.handleDropDown(sd.getCoursedd(), pUtil.readDataFromPropertyFile("courseName"));
		
		TestingPage t=new TestingPage(driver);
		wUtil.dragAndDrop(driver, t.getSeleniumTraining(),t.getCart());		
		wUtil.scrollAction(driver, t.getFacebook());
		t.facebookIcon();
		
		Reporter.log("TestCase2 executed successfully",true);
		
	}
	@Test(groups ="SmokeSuite")
	public void demo1() {
		Reporter.log("TestCase2 Smoke",true);
	}
	@Test(groups ="RegressionSuite")
	public void demo2() {
		Reporter.log("TestCase2 Regression",true);
	}
	@Test
	public void demo3() {
		Reporter.log("TestCase2 NoSmoke-NoRegression",true);
	}
	@Test
	public void demo4() {
		Reporter.log("TestCase2 RegionalRegression",true);
	}


}
