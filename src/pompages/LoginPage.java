package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declare all the elements
	@FindBy(id="username")
	WebElement unTB;

	@FindBy(name="pwd")
	WebElement pwdTB;

	@FindBy(xpath="//div[text()='Login ']")
	WebElement LoginBtn;

	@FindBy(id="logoutLink")
	WebElement LogoutBtn;
	//Initialize all the elements

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilize all the elements
	public void SetUserName(String un)
	{
		unTB.sendKeys(un);
	}

	public void getPassword(String pwd)
	{
		pwdTB.sendKeys(pwd);
	}

	public void ClickLogin()
	{
		LoginBtn.click();
	}

	public void ClickLogout()
	{
		LogoutBtn.click();
	}

}

