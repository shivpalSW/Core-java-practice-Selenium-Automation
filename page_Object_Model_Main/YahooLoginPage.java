package page_Object_Model_Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 //YahooMail User name Login page class
//(This Class belongs to POM Main package--->page_Object_Model_Main)
public class YahooLoginPage {

	// Declaration

	private WebElement userName;
	private WebElement loginNext;
	

	WebDriver driver;

	// Initialization

	public YahooLoginPage(WebDriver driver) { // passing a values trough a a constructor

		this.driver = driver;

		userName = driver.findElement(By.xpath("//input[@id='login-username']"));
		loginNext = driver.findElement(By.xpath("//input[@id='login-signin']"));
	
	}

	// Usages
	public void setYahooLoginUserName() {

		userName.sendKeys("Enter your yahoo id here");
	}

	public void setYahooLoginNext() {

		loginNext.click();
	}

}
