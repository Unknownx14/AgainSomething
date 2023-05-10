package Academy.RealTimeExercise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkCounts90 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://qaclickacademy.com/");
		
		
		//Explicit wait - define the object of the class
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".listbuilder-popup-scale")));
		
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		
		
		//01. Give me the count of links on the page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		Assert.assertEquals(allLinks.size(), 27);
		
		
		//02. Count of links presented in the footer section
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gf-BIG")));
		WebElement footer = driver.findElement(By.cssSelector("#gf-BIG"));
		List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
		System.out.println(footerLinks.size()+" is the number of links in the footer section.");
		
		
		//03. Count the number of link in the footer section, but only for the first column
		WebElement footerFirstColumn = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		List<WebElement> footerLinksFirtsColumn = footerFirstColumn.findElements(By.tagName("a"));
		System.out.println(footerLinksFirtsColumn.size()+" is the number of links in the footer section for the First column.");
		
		//04. Click on each link and check if the pages are opening
		for(int i=1;i<footerLinksFirtsColumn.size();i++)
		{
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			//footerLinksFirtsColumn.get(i).click();
			footerLinksFirtsColumn.get(i).sendKeys(clickOnLink);
			Thread.sleep(3000);
			
					
		}
		
		//For switching between windows
		Set<String> windowSwitch = driver.getWindowHandles();
		Iterator<String> iter = windowSwitch.iterator();
			
			while(iter.hasNext())
			{
				driver.switchTo().window(iter.next());
				System.out.println(driver.getCurrentUrl()); 
			}
		
		
		
	}

}
