package Academy.WebElementsAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		Boolean isSelected = driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
		Assert.assertTrue(isSelected);
		
		//Count the number of checkboxes
		List<WebElement> allCheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(allCheckboxes.size()); 
		Assert.assertEquals(allCheckboxes.size(), 6);
		
	}

}
