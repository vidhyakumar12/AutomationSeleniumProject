package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.lib;
import pompages.LoginPage;

public class TestInvalidLogin extends BaseTest{

	@Test
	public void testInValidLogin() throws InterruptedException
	{
		LoginPage L=new LoginPage(driver);
		int rowcount=lib.getRowCount("InvalidLogin");
		for (int i = 1; i <=rowcount; i++) 
		{
			String username=lib.getCellValue("InvalidLogin", i, 0);
			L.SetUserName(username);
			String pwd=lib.getCellValue("InvalidLogin", i, 1);
			L.getPassword(pwd);
			Thread.sleep(2000);
			L.ClickLogin();
		}

	}
}
