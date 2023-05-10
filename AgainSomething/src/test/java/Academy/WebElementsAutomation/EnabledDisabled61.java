package Academy.WebElementsAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnabledDisabled61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*Boolean disabledDate = driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled();
		Assert.assertFalse(disabledDate);*/
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		//Get one of the attributes that changes from enabled to disabled
		String styleAttribute = driver.findElement(By.cssSelector("#Div1")).getAttribute("style");
		System.out.println(styleAttribute);
		
		if(styleAttribute.contains("opacity: 1"))
		{
			System.out.println("This element is enabled.");
		}
		else
		{
			System.out.println("This element is disabled.");
		}
		
		Assert.assertTrue(styleAttribute.contains("opacity: 1"));
		
	}

}
