package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Program by onkar
public class PopUp1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);

		d.switchTo().frame(0);
		
		  d.findElement(By.xpath("//div[@class='ytp-cued-thumbnail-overlay']//button"))
		  .click(); Thread.sleep(2000);
			
			  d.findElement(By.xpath("//button[@class='ytp-mute-button ytp-button']")).
			  click(); Thread.sleep(5000);
			  d.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).
			  click(); Thread.sleep(2000);
			  
			  d.switchTo().parentFrame(); Thread.sleep(2000);
			  
			  JavascriptExecutor sc = ((JavascriptExecutor) d);
			  sc.executeScript("scroll(0, 1800)"); Thread.sleep(5000);
			  
			  d.switchTo().frame("a077aa5e"); Thread.sleep(2000);
			  d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
			  Thread.sleep(5000);
			  
			  d.switchTo().defaultContent();
			  d.findElement(By.xpath("//li[@class='item844 parent']//a")).click();
			  Thread.sleep(5000);
			 
	}
}
