package Academy.WebElementsAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaAlerts65 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our
													// local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String someTxt = "Jovan";
		// 01. Java Script Alert with only the OK button
		driver.findElement(By.cssSelector("#name")).sendKeys(someTxt);
		driver.findElement(By.cssSelector("#alertbtn")).click();

		// Switch to this Java Alert
		Thread.sleep(1000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Assert.assertEquals(alertText, "Hello " + someTxt + ", share this practice page and share your knowledge");
		driver.switchTo().alert().accept();

		// 02. Java Script Alert with the OK and CANCEL buttons
		driver.findElement(By.cssSelector("#name")).sendKeys(someTxt);
		driver.findElement(By.cssSelector("#confirmbtn")).click();

		// Switch to this Java Alert
		Thread.sleep(1000);
		String alertText02 = driver.switchTo().alert().getText();
		System.out.println(alertText02);
		driver.switchTo().alert().dismiss();

	}

}
