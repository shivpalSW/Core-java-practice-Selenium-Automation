package pageFactory_Main;
//YahooMail Password field class =2

//(This Class belongs to Page factory Main package--->pageFactory_Main)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooLoginPagePF2 {

	// Declaration and Initialization of WebElements
	@FindBy(xpath = "//input[@id='login-passwd']")
	private WebElement password;

	@FindBy(xpath = "//button[@id='login-signin']")
	private WebElement login;

	public YahooLoginPagePF2(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// usage
	public void setYahooLoginPasswordPF() {
		password.sendKeys("shiv243882735373");
	}

	public void setYahooLoginPF() {
		login.click();

	}
}
