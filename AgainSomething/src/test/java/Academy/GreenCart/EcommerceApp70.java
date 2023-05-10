package Academy.GreenCart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceApp70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); // WebDriver manager for invoking the chromedriver that is not on our local machine
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		// *****JK***** Add a Cucumber into the cart - Using loops
		
		List<WebElement> allProducts = driver.findElements(By.cssSelector(".product"));
		
		//Introducing an Array since we want multiple products to be added into the cart
		String [] wantedProductsArray = {"Cucumber","Raspberry", "Beetroot", "Brocolli", "Corn"};
		
		String wantedProduct = "Cucumber";
		int j=0;
		for(int i=0; i<allProducts.size()-1;i++) //Here -1 is because there are 31 .product elements and only 30 products on the web page
		{
			String singleProductName = allProducts.get(i).findElement(By.cssSelector(".product-name")).getText();
			
			//Here we must convert an Array into the ArrayList because an ArrayList supports contains() method
			List wantedProductsArrayList = Arrays.asList(wantedProductsArray);
			
			//Since singleProductName is wider than wantedProductsArrayList, we must trim it
			String [] splittedProductName = singleProductName.split("-");
			String trimedProductName = splittedProductName[0].trim();
			
			
				if(wantedProductsArrayList.contains(trimedProductName)) //wantedProductsArrayList.contains(singleProductName)
				{
					
						System.out.println(singleProductName);
						allProducts.get(i).findElement(By.cssSelector(".product-action")).click(); //button[@type='button']
						//break; //Do not use break; when an ArrayList is used
						j++;
							if(j==wantedProductsArrayList.size()) //This counts the number of times this block of code has been executing
							{
								break;
							}
					
					
				}
		}
		System.out.println(j);
		
		
		
	}

}
