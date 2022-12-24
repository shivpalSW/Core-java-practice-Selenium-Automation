package practice_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauncingBrowser {

	public static void main(String[] args) throws Exception {

		// Setting a path and property of ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_win32_87.0.4280.88\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// Created a object of ChromeDriver class

		driver.get( 
				"https://www.bxaccess.com/auth/login?wa=wsignin1.0&wtrealm=https%3a%2f%2fwww.bxaccess.com&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fportal%252f&wct=2020-12-01T17%3a40%3a19Z");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://pro.upstox.com/login");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		// String str = driver.getPageSource();
		// System.out.println(str);
		String str1 = driver.getCurrentUrl();
		System.out.println(str1);
		String str2 = driver.getTitle();
		System.out.println(str2);
		
		//Locating Strategy'= By xpath contains method
		driver.findElement(By.xpath("//input[contains(@id,'userCode')]")).sendKeys("ABjBJVDS");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Upstox");
		driver.findElement(By.xpath("//div[text()='Sign into Upstox Pro']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
