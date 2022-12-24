package page_Object_Model_Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// YahooMail Password field class
//(This Class belongs to POM Main package--->page_Object_Model_Main)
public class YahooLoginPage2 {
	
	private WebElement password;
	private WebElement login;
	
	WebDriver driver;
	
	public YahooLoginPage2(WebDriver driver) { // passing a values trough a a constructor

		this.driver = driver;
		
		password = driver.findElement(By.xpath("//input[@id='login-passwd']"));
		login = driver.findElement(By.xpath("//button[@id='login-signin']"));
}
	// Usages
	public void setYahooLoginPassword() {
		password.sendKeys("Enter your password here");
	}

	public void setYahooLogin() {
		login.click();

	}
}