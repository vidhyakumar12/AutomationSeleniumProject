package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {

	@Test
	public void testValidLogin()
	{
		LoginPage L=new LoginPage(driver);
		String username=lib.getCellValue("ValidLogin", 1, 0);
		L.SetUserName(username);
		String pwd=lib.getCellValue("ValidLogin", 1, 1);
		L.getPassword(pwd);
		L.ClickLogin();


	}
}
