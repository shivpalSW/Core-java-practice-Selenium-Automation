package pageFactory_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//YahooMail Home page class =3
//(This Class belongs to PageFactory Main package--->pageFactory_Main)
public class YahooHomePagePF {
	
	@FindBy(xpath= "//img[@class='_yb_1vir1 _yb_ufdle']")
	private WebElement header;
	
	@FindBy(xpath= "//span[text()='SHIVPAL']")
	private WebElement logoutmenu;
	
	@FindBy(xpath= "//span[text()= 'Sign out']")
	private WebElement logout;
	
	public YahooHomePagePF (WebDriver driver) {
		
	PageFactory.initElements(driver,this);
}
	//Usage 
	public void verifyYahooHomeHeaderPF() {

		boolean result = header.isEnabled();

		if (result == true) {

			System.out.println("Home page logo is  Enabled");
		} else {
			System.out.println("Home page logo is not Enabled");
		}
	}

	public void YahooLogOutMenuPF() {

		logoutmenu.click();
	}

	public void clickYahoologOutPF() {
		logout.click();
	}
	
}
