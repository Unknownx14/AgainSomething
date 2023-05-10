package Academy.WebElementsAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown52 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Explicit wait - define the object of the class
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value='MAA'])[2]")));
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector("#glsctl00_mainContent_ddl_destinationStation1_CTNR a[value='MAA']")).click();
		
		//Calendar JK
		for(int j=0;j<9;j++)
		{
		String singleMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
		if(singleMonth.equalsIgnoreCase("March"))
		{
			List<WebElement> allDates = driver.findElements(By.cssSelector(".ui-state-default"));
			for(int i=0;i<allDates.size();i++)
			{
				String singleDate = allDates.get(i).getText();
				if(singleDate.equalsIgnoreCase("14"))
				{
					allDates.get(i).click();
				}
					
			}
		}
		driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}

		
	}

}
