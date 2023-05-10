package Academy.GreenCart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceApp68 {

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
		
		
		String wantedProduct = "Cucumber";
	/*	for(int i=0; i<allProducts.size();i++)
		{
			String singleProductName = allProducts.get(i).findElement(By.cssSelector(".product-name")).getText();
			
			
				if(singleProductName.contains(wantedProduct))
				{
					System.out.println(singleProductName);
					allProducts.get(i).findElement(By.cssSelector(".product-action")).click(); //button[@type='button']
					break;
				}
		}*/
		
		
		// *****JK***** Add a Cucumber into the cart - Using Streams instead of loops
		WebElement stream01 = allProducts.stream().filter(oneProduct->oneProduct.findElement(By.cssSelector(".product-name")).getText().contains(wantedProduct))
		.findFirst().orElse(null);
		
		System.out.println(stream01.findElement(By.cssSelector(".product-name")).getText());
		stream01.findElement(By.cssSelector(".product-action")).click(); ////button[text()='ADD TO CART']
		
	}

}
