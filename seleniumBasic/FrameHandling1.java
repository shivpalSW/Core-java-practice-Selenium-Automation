package seleniumBasic;
//vctc Pune website
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://vctcpune.com/selenium/practice.html");
		//scroll down to web page
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		
		je.executeScript("scroll(0,3200)");
		Thread.sleep(2000);
		je.executeScript("scroll(0,-3200)");// scroll up web page
		Thread.sleep(2000);
		

		je.executeScript("scroll(0,3200)");// scroll down web page
		
		//Switching to child frame
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(2000);
		
		//frame scroll down
		JavascriptExecutor jf = ((JavascriptExecutor)driver);
		jf.executeScript("scroll(0,1800)");
		
		Thread.sleep(3000);
		//Finding Enroll now Element
		driver.findElement(By.xpath("(//a[@class='et_pb_button et_pb_promo_button'])[1]")).click();
		

		//Switching to default parent frame
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		je.executeScript("scroll(0,-3200)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
	}

}
