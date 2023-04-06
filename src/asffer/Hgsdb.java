package asffer;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Hgsdb {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://gcreddy.com/project/login.php");
			
			
			driver.findElement(By.name("email_address")).sendKeys("sriniram123@gmail.com");
			driver.findElement(By.name("password")).sendKeys("abcd321");
			driver.findElement(By.id("tdb1")).click();
			Thread.sleep(2000);

			try {
			boolean elementExistence = driver.findElement(By.linkText("Log Off")).isDisplayed();

			if (elementExistence == true) {
			System.out.println("Customer Login is Successful – Passed");
			}
			}
			catch (NoSuchElementException e1) {
			System.out.println("Customer Login is Unsuccessful – Failed");
			}
			driver.close();
		}
}
