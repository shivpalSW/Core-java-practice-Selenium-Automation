package com.Practice.mouseActions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Mouse Actions
public class MouseActions1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement button = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		// Actions class
		Actions obj = new Actions(driver);
		Thread.sleep(3000);
		obj.moveToElement(button).perform();

		List<WebElement> option = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int elesize = option.size();

		System.out.println(elesize);
		//	for loop
		for (int i = 0; i <elesize; i++) {

			WebElement element = option.get(i);

			String text = element.getAttribute("innerHTML");
			System.out.println(text);
		
			if (text.equalsIgnoreCase("Appium")) {// also we can take if(text== APPIUM)
				element.click();
				break;
			}
		}

	}
}
