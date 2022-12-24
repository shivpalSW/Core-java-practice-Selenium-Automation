package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram1 {

	public static void main(String[] args) {
		// setting property of Chrome browser and passing chromeDriver path

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // valid line, Upcasting concept used here
		// WebDriver driver = new WebDriver (); // Invalid, We can't create object of an interface
		
		// ChromeDriver driver = new ChromeDriver (); // valid line, We can create instance/object of class
		
		// ChromeDriver drive = new FirefoxDriver (); //Invalid line, Both are sharing the same Hierarchy

		driver.manage().window().maximize(); // WebDriver method

		driver.get("https://www.facebook.com/"); // WebDriver method

	}

}
