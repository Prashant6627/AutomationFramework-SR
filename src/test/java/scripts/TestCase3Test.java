package scripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import skillrary.GenericUtility.BaseClass;
import skillrary.GenericUtility.ListenersImplementationClass;
import skillrary.ObjectRepository.CoreJavaPage;
import skillrary.ObjectRepository.HomePage;
import skillrary.ObjectRepository.WishListPage;


@Listeners(ListenersImplementationClass.class)
public class TestCase3Test extends BaseClass{
	
	@Test(groups = "RegressionSuite")
	public void tc3() throws IOException, InterruptedException {
		HomePage s=new HomePage(driver);
		s.searchTextBox(pUtil.readDataFromPropertyFile("searchTextBox"));
		s.searchButton();
		
		CoreJavaPage c=new CoreJavaPage(driver);
		c.coreJavaCourse();
		
		WishListPage w=new WishListPage(driver);
		w.closeCookies();
		wUtil.switchToFrame(driver, 0);
		w.playButton();
		Thread.sleep(3000);
		w.pauseButton();
		wUtil.switchToParentFrame(driver);
		w.wishList();
		
		Reporter.log("TestCase3 executed successfully",true);
		
	}
	@Test(groups ="SmokeSuite")
	public void demo1() {
		Reporter.log("TestCase3 Smoke",true);
	}
	@Test(groups ="RegressionSuite")
	public void demo2() {
		Reporter.log("TestCase3 Regression",true);
	}
	@Test
	public void demo3() {
		Reporter.log("TestCase3 NoSmoke-NoRegression",true);
	}
	@Test
	public void demo4() {
		Reporter.log("TestCase3 RegionalRegression",true);
	}

}
