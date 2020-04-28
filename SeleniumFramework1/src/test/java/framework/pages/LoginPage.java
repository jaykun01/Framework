package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='wp-submit']")
	WebElement submit_button;

	@FindBy(how=How.LINK_TEXT,using="Lost your password?")
	WebElement forget_pass_link;
	
	public void LoginWordpress(String uname, String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit_button.click();
	}
}
