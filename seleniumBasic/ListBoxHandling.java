package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(day);
		s1.selectByIndex(24); // Select class related Method=1

		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Mar"); // Select class related Method=2

		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(year);
		s3.selectByValue("1993");
		; // Select class related Method=3

		List<WebElement> options3 = s3.getOptions();

		int size3 = options3.size();
		System.out.println(size3);

		for (int i = 0; i < size3; i++) {

			// options.get(i).getText();
			String element3 = options3.get(i).getText();
			System.out.println(element3);
		}

		List<WebElement> options2 = s2.getOptions();
		int size2 = options2.size();
		System.out.println(size2);

		for (int j = 1; j < size2; j++) {
			// options1.get(j).getText();
			String element2 = options2.get(j).getText();
			System.out.println(element2);
		}
		List<WebElement> options1 = s1.getOptions();
		int size1 = options1.size();
		System.out.println(size1);

		for (int k = 1; k < size1; k++) {
			// options1.get(k).getText();
			String element1 = options1.get(k).getText();
			System.out.println(element1);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
