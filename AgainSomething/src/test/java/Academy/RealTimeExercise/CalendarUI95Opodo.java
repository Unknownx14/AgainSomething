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

public class CalendarUI95Opodo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.opodo.com/");
			
		
		//Explicit wait - define the object of the class
				WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#didomi-notice-agree-button")));
		driver.findElement(By.cssSelector("#didomi-notice-agree-button")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Departure']")).click();
		String wantedMonthDeparture = "March '23";
		String wantedDayDeparture = "24";
		String wantedDayReturn = "21";
		String wantedMonthReturn = "June '23";
		
		
		//Find the desired Departure month JK solution
		for(int i=0;i<10;i++)
		{
			String currentMonth = driver.findElement(By.xpath("(//div[@class='odf-calendar-title'])[1]")).getText();
			System.out.println(currentMonth);
				if(!currentMonth.equalsIgnoreCase(wantedMonthDeparture))
				{
					driver.findElement(By.cssSelector("span[glyph='arrow-right']")).click();
					
				}
				else
				{
					break;
					}
		}

		
		
		
		//Limiting driver scope for the Departure calendar
		WebElement departureDates = driver.findElement(By.xpath("(//div[@class='odf-calendar-month'])[1]"));
		List<WebElement> allDatesList = departureDates.findElements(By.cssSelector(".odf-calendar-day"));
		System.out.println(allDatesList.size());
		for(int i=0;i<allDatesList.size();i++)
		{
			Thread.sleep(1000);
			String availableDates = allDatesList.get(i).getText();
				if(availableDates.equalsIgnoreCase(wantedDayDeparture))
				{
					allDatesList.get(i).click();
					break;
				}
		}
		
		
		
		//Find the desired Return month Rahul's solution
		
		driver.findElement(By.cssSelector("input[placeholder='Return']")).click();
		
		Boolean currentMonthReturn = driver.findElement(By.xpath("(//div[@class='odf-calendar-title'])[1]")).getText().contains(wantedMonthReturn);
		while(!driver.findElement(By.xpath("(//div[@class='odf-calendar-title'])[1]")).getText().contains(wantedMonthReturn))
		{
			driver.findElement(By.cssSelector("span[glyph='arrow-right']")).click();
		}
		
		
		//Limiting driver scope for the Return calendar
		WebElement returnDates = driver.findElement(By.xpath("(//div[@class='odf-calendar-month'])[1]"));
		List<WebElement> allDatesListReturn = returnDates.findElements(By.cssSelector(".odf-calendar-day"));
		System.out.println(allDatesListReturn.size());
		for(int i=0;i<allDatesListReturn.size();i++)
		{
			Thread.sleep(1000);
			String availableDatesReturn = allDatesListReturn.get(i).getText();
				if(availableDatesReturn.equalsIgnoreCase(wantedDayReturn))
				{
					allDatesListReturn.get(i).click();
					break;
				}
		}
		
		driver.findElement(By.xpath("(//button[contains (@class,'prisma-btn-round')])[2]"));
		
		
		
		//*****JK***** Continue this later
		//Explicit wait - define the object of the class
/*		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='flatpickr-next-month'] svg path")));
		WebElement nextClick = driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] svg path"));
		nextClick.click();
		*/
	}

}
