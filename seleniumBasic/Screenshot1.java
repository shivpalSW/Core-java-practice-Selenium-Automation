package seleniumBasic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php");
		//Implicit wait provided
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File  src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File d = new File ("F:\\TESTING_FOLDER\\VELOCITY\\Screenshot_Exercise_Path\\Testcase2.png");
		
		FileHandler.copy(src, d);
		
		
		//FileUtils.copyFile(src, d); //for this we need selenium 2.53.0 version 
		Thread.sleep(3000);
		driver.close();
		
		
		

	}
	

}
