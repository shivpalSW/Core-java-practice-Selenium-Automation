package page_Object_Model_Main;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//public class YahooTest {
//
//	public static void main(String[] args) throws Exception {
//
//		System.setProperty("webdriver.chrome.driver",
//				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(
//				"https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3Freason%3Dinvalid_cred");
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//		
//		// Object creation of POM Class 1-----------------------------------------------
//		driver.navigate().refresh();
//		
//		YahooLoginPage login = new YahooLoginPage(driver);
//
//		login.setYahooLoginUserName();
//		login.setYahooLoginNext();
//		Thread.sleep(3000);
//		
//		// Object creation of POM Class 2--------------------------------------------------
//		YahooLoginPage2 midlogin = new YahooLoginPage2(driver);
//		midlogin.setYahooLoginPassword();
//		midlogin.setYahooLogin();
//
//		Thread.sleep(3000);
//		
//		// Object creation of POM Class 3--------------------------------------------------
//		YahooHomePage home = new YahooHomePage(driver);
//		Thread.sleep(3000);
//		home.verifyYahooHomeHeader();
//		home.YahooLogOutMenu();
//		home.clickYahoologOut();
//
//	}
//
//}
