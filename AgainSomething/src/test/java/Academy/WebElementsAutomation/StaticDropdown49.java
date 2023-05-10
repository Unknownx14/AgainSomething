package Academy.WebElementsAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdown49 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Dropdown with the Select tag, there is a class in the Selenium called Select, and this class expects an argument(WebElement of this static dropdown)
		WebElement staticDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown =  new Select(staticDropdown);
		dropdown.selectByIndex(3);
		String currencyText = dropdown.getFirstSelectedOption().getText();
		System.out.println(currencyText);
		dropdown.selectByVisibleText("AED");
		dropdown.selectByValue("INR");
		
		//Passengers dropdown
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(1000);
		
	/*	for(int i=1;i<=3;i++)
		{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		*/
		int i=1;
		while(i<=3)
		{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		
		String adultText = driver.findElement(By.cssSelector("#divpaxinfo")).getText();
		System.out.println(adultText);
		Assert.assertEquals(adultText, "4 Adult");
		
	}

}
