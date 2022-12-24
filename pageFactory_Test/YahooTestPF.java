package pageFactory_Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory_Main.YahooHomePagePF;
import pageFactory_Main.YahooLoginPagePF;
import pageFactory_Main.YahooLoginPagePF2;


public class YahooTestPF {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3Freason%3Dinvalid_cred");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Object creation of PageFactory Class 1-----------------------------------------------
		driver.navigate().refresh();

		YahooLoginPagePF log = new YahooLoginPagePF(driver);

		log.setYahooLoginUserNamePF();
		log.setYahooLoginNextPF();
		Thread.sleep(3000);

		// Object creation of PageFactory Class 2--------------------------------------------------
		YahooLoginPagePF2 midlogin = new YahooLoginPagePF2(driver);
		midlogin.setYahooLoginPasswordPF();
		midlogin.setYahooLoginPF();

		Thread.sleep(3000);

		// Object creation of PageFactory Class 3--------------------------------------------------
		YahooHomePagePF home = new YahooHomePagePF(driver);
		Thread.sleep(3000);
		home.verifyYahooHomeHeaderPF();
		Thread.sleep(3000);
		home.YahooLogOutMenuPF();
		home.clickYahoologOutPF();

	}

}
