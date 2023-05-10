package Academy.RealTimeExercise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarUI95 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
      //This will scroll the page till the element is found		
        //js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("#form-field-travel_comp_date")));
		
		js.executeScript("window.scrollBy(0,1100)");
		Thread.sleep(1000);
		//Dropdown with the Select tag, there is a class in the Selenium called Select, and this class expects an argument(WebElement of this static dropdown)
				WebElement staticDropdown = driver.findElement(By.cssSelector("#form-field-travel_comp_language"));
				Select dropdown =  new Select(staticDropdown);
				dropdown.selectByVisibleText("English");
			
				
		        
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		String wantedMonth = "March";
		String wantedDay = "24";
		String wantedYear = "2023";
		
		String currentMonth = driver.findElement(By.cssSelector(".cur-month")).toString();
		String currentYear = driver.findElement(By.cssSelector(".numInput.cur-year")).toString();
		
		List<WebElement> allDatesList = driver.findElements(By.cssSelector(".flatpickr-day "));
		System.out.println(allDatesList.size());
		for(int i=0;i<allDatesList.size();i++)
		{
			Thread.sleep(1000);
			String availableDates = allDatesList.get(i).getText();
				if(availableDates.equalsIgnoreCase(wantedDay))
				{
					allDatesList.get(i).click();
					break;
				}
		}
		
		
		
		
		
		
		//*****JK***** Continue this later
		//Explicit wait - define the object of the class
/*		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='flatpickr-next-month'] svg path")));
		WebElement nextClick = driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] svg path"));
		nextClick.click();
		*/
	}

}
