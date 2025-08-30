package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // auto-matches Chrome
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,500)");

		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> list=driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		int sum=0;
		for(int i=0; i<list.size(); i++) {
			sum=sum+ Integer.parseInt(list.get(i).getText());
		}
		System.out.println(sum);
//		List<WebElement> lists=driver.findElements(By.cssSelector("div[class='table-display'] td:nth-child(4)"));
//		int total=0;
//		for(int j=0; j<lists.size(); j++) {
//			
//			total=total+Integer.parseInt(lists.get(j).getText());
//		}
//		System.out.println(total);
	}

}
