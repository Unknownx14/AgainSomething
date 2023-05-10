package Academy.AgainSomething;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAuthPopup234 {

	
	
	
	@Test
	public void WindowAuthenticationPopupTestCase234()
	{
		
		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();
		String confirmationText = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(confirmationText);
		Assert.assertEquals(confirmationText, "Congratulations! You must have the proper credentials.");
		driver.close();

	}
	
	
	
	@Test
	public void UploadPDFFileAutoITTestCase236237239() throws InterruptedException, IOException
	{
		
		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		
		//Before ChromeOptions go these 3 lines of code, just copy/paste and a downloaded file will be stored in the project path(not in the Downloads)
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
		
		//ChromeOptions class goes before invoking the WebDriver driver
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs); //Now driver will know all the preferences
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		
		driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
		Thread.sleep(2000);
		
		//To run a .exe file
		Runtime.getRuntime().exec("C:\\Users\\joko2909\\Desktop\\Prntscr\\Prnt for a bug\\14.06\\fileUpload0211.exe");
		
		//Explicit wait - define the object of the class
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTask")));
		
		driver.findElement(By.cssSelector("#processTask")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
		driver.findElement(By.cssSelector("#pickfiles")).click();
		Thread.sleep(3000);
		
		//For verifying that a file has been successfully downloaded
		File f = new File(System.getProperty("user.dir") + "\\001import_page-0001.jpg");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
			System.out.println("File has been successfully downloaded." + f.exists());
			if(f.delete())
			{
				System.out.println("File has been deleted.");
			}
		}

	}
	

}
