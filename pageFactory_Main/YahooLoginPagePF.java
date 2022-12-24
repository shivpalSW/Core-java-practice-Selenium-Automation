package pageFactory_Main;
//YahooMail User name Login page class=1
//(This Class belongs to Page Factory Main package--->package pageFactory_Main)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooLoginPagePF {
	
	// Declaration and Initialization of WebElements
		@FindBy(xpath = "//input[@id='login-username']")
		private WebElement userName;
		
		@FindBy(xpath ="//input[@id='login-signin']")
		private WebElement loginNext;
	
	
		public YahooLoginPagePF (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
		//Usage
		public void setYahooLoginUserNamePF() {

			userName.sendKeys("shivpal.wadkar2050");
		}

		public void setYahooLoginNextPF() {

			loginNext.click();
		}

}
