package Academy.WebElementsAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropdown55 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		
		List<WebElement> partialStates = driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
		for(int i=0;i<partialStates.size();i++)
		{
			String singleState = partialStates.get(i).getText();
			System.out.println(singleState);
			if(singleState.equalsIgnoreCase("India"))
			{
				partialStates.get(i).click();
			}
		}
		
		
	}

}
