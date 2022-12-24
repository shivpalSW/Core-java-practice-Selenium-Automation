package seleniumBasic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram2 {
//Checking login functionality of linkedin with wrong credentials
	public static void main(String srgs[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.linkedin.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();

		String str = driver.getTitle();
		System.out.println(str);

		String str1 = driver.getCurrentUrl();
		System.out.println(str1);
		// by ID
		driver.findElement(By.id("session_key")).sendKeys("shivpalwadkar2050@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("session_password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class ='sign-in-form__submit-button']")).click();
		
		
	}

}
