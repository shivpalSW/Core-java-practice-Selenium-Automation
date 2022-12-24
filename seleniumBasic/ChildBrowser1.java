package seleniumBasic;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Set<String> ele = driver.getWindowHandles();
		
		System.out.println(ele);
		
		String win = "CDwindow-9D074823AFFD7E4ADDDF663ACC7F788B";
		
		driver.switchTo().window(win);
		
		driver.findElement(By.xpath("(//div[text()='Enroll Now'])[1]")).click();
		
		//This program is incomplete.How to move to child browser?

	}

}
