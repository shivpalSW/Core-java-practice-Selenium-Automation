package page_Object_Model_Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// YahooMail Home page class 
//(This Class belongs to POM Main package--->page_Object_Model_Main)
public class YahooHomePage {

	// Declaration

	private WebElement header;
	private WebElement logoutmenu;
	private WebElement logout;

	WebDriver driver;

	// Initialization

	public YahooHomePage(WebDriver driver) {

		this.driver = driver;

		header = driver.findElement(By.xpath("//img[@class= '_yb_1vir1 _yb_ufdle']"));

		logoutmenu = driver.findElement(By.xpath("//span[text()='SHIVPAL']"));

		logout = driver.findElement(By.xpath("//span[text()= 'Sign out']"));

	}
	// usage

	public void verifyYahooHomeHeader() {

		boolean result = header.isDisplayed();

		if (result == true) {

			System.out.println("Home page logo is  displayed");
		} else {
			System.out.println("Home page logo is not displayed");
		}
	}

	public void YahooLogOutMenu() {

		logoutmenu.click();
	}

	public void clickYahoologOut() {
		logout.click();
	}
}
