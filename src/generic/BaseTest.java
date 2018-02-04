package generic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	static{
		System.setProperty(GECKO_KEY, GECKO_PATH);
		System.setProperty(CHROME_KEY, CHROME_PATH);
	}
	@BeforeMethod
	public void openApplication(){
		driver=new FirefoxDriver();
		String url=lib.getPropertyValue("URL");
		driver.get(url);
		String ito=lib.getPropertyValue("ITO");
		int implicitwait=Integer.parseInt(ito);
		driver.manage().timeouts().implicitlyWait(implicitwait,TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeApplication(){
		driver.close();

	}
}
