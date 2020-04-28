package framework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.pages.BaseClass;
import framework.pages.LoginPage;

public class LoginTest extends BaseClass{
		
	
	@Test(priority=1)
	public void loginApp()
	{
		
		logger = report.createTest("Login to WordPress");
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting application");
		
		loginpage.LoginWordpress(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		logger.pass("Login successful");
	}

	
	@Test(priority=2)
	public void loginApp1()
	{
		
		logger = report.createTest("Logout");
		
		logger.info("this is second test");
		
		logger.fail("Login has failed");
	}
}
