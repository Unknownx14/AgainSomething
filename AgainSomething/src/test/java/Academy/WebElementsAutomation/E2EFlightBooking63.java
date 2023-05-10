package Academy.WebElementsAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2EFlightBooking63 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//01. Click on the Round-trip radio button and verify that the return date field is now enabled
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
		
		
		//01a. Click on the One-way trip radio button and verify that the return date field is now disabled
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		//Get one of the attributes that changes from enabled to disabled
		String styleAttribute02 = driver.findElement(By.cssSelector("#Div1")).getAttribute("style");
		System.out.println(styleAttribute02);
		
		if(styleAttribute02.contains("opacity: 0.5"))
		{
			System.out.println("This element is disabled.");
		}
		else
		{
			System.out.println("This element is enabled.");
		}
		
		Assert.assertTrue(styleAttribute02.contains("opacity: 0.5"));
		
		
		
		//02. Click on the Family and friends check box
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		Boolean isSelected = driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
		Assert.assertTrue(isSelected);
		
		
		//03. Choose a number of passengers
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
		
	
		//04. Choose a currency
		//Dropdown with the Select tag, there is a class in the Selenium called Select, and this class expects an argument(WebElement of this static dropdown)
				WebElement staticDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
				Select dropdown =  new Select(staticDropdown);
				dropdown.selectByIndex(3);
				String currencyText = dropdown.getFirstSelectedOption().getText();
				System.out.println(currencyText);
				dropdown.selectByVisibleText("AED");
				dropdown.selectByValue("INR");
		
		
		//05. Select From and To destinations
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Explicit wait - define the object of the class
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value='MAA'])[2]")));
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector("#glsctl00_mainContent_ddl_destinationStation1_CTNR a[value='MAA']")).click();
		
		//06. Choose a date from the Calendar
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class*='highlight']")));
		driver.findElement(By.cssSelector("a[class*='highlight']")).click();
		
		
		//07. Click on the Search button
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		
	}

}
