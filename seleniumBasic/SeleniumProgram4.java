package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Amazon india product add to cart
public class SeleniumProgram4 {

	public static void main(String[] args) throws Exception {
		// setting property of Chrome browser and passing chromeDriver path
		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Object creation
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Xpath By Text Function
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(2000);
		//Xpath By TagName and index
		driver.findElement(By.xpath("(//a[@class='a-link-normal'])[7]//img[1]")).click();
		//OR
		//driver.findElement(By.xpath("(//div[@class='a-column a-span3'])[1]")).click();
		Thread.sleep(2000);
		//Xpath By TagName and index
		driver.findElement(By.xpath("(//div[@class='bxc-grid__image   bxc-grid__image--light'])[6]//a[1]//img[1]")).click();
		Thread.sleep(2000);
		//Xpath By TagName and index
		driver.findElement(By.xpath("//a[@target='_blank']//div[1]//img[1]")).click();
		Thread.sleep(4000);
		//Xpath By Attribute name
		//driver.findElement(By.xpath("(//div[@id='addToCart_feature_div'])//input[1]")).click();
		//Xpath By contains method
		//driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();
		//Xpath By starts-with method
		//driver.findElement(By.xpath("//input[starts-with(@id,'add-to-cart-button')]")).click();
		driver.findElement(By.xpath("(//div[@id='buyNow_feature_div'])//input[1]")).click();
	}  
	

}
