import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("jeans");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Selecting one product among multiple jeans
		driver.findElement(By.cssSelector(".a-section.aok-relative.s-image-tall-aspect")).click();
		//getting the text of selected jeans
		WebElement productName=driver.findElement(By.id("productTitle"));
		System.out.println("Product name is " +productName.getText());
		//getting the price of selected jeans
		WebElement productPrice=driver.findElement(By.className("a-price-whole"));
		System.out.println("Product Price is " + productPrice.getText());
		//selecting the product to Add to cart
		WebElement clickAddToCartButton=driver.findElement(By.id("add-to-cart-button"));
		clickAddToCartButton.click();
		//clicking Cart link to verify the selected product is there or not
		WebElement clickCartLink=driver.findElement(By.id("nav-cart-count-container"));
		clickCartLink.click();
		driver.quit();







	}

}
