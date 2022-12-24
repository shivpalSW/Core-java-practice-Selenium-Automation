package seleniumBasic;

//Opening a new tab in same browser Program  by Pooja S
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabOpen {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"F:\\TESTING_FOLDER\\VELOCITY\\SOFTWARES\\chromedriver_Version 85.0.4183.83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String parentWindow = driver.getWindowHandle();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String a = "window.open('https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator')";
		((JavascriptExecutor) driver).executeScript(a);
		Thread.sleep(4000);

		for (String childWindow : driver.getWindowHandles()) {
			System.out.println("child window:::" + childWindow);
			driver.switchTo().window(childWindow);
		}
		driver.findElement(By.xpath("//*[@id=\"amt\"]")).clear();
		driver.findElement(By.id("amt")).sendKeys("150000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"years\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("4");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"carSpecs\"]/div/div[1]/div[5]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath(
				"//*[@id=\"main\"]/div/footer/div/div/div/div/div[3]/div/div/div/div[1]/div[11]/ul/li[2]/a/span"))
				.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
