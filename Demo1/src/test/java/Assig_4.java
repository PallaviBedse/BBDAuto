import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assig_4 {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bedse\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	
	 WebElement Women = driver.findElement(By.xpath("//div[@data-reactid='178']"));
     Actions actions = new Actions(driver);
     actions.moveToElement(Women);
     WebElement Tops = driver.findElement(By.xpath("//a[text()='Tops']"));
     actions.moveToElement(Tops);
     actions.click().build().perform();
     Thread.sleep(2000);
     
     
     WebElement sortBy = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
     Actions actions2 = new Actions(driver);
     actions.moveToElement(sortBy).build().perform();
     
     WebElement Popularity = driver.findElement(By.xpath("(//*[@class='sort-label '])[2]"));
     actions2.click(Popularity).build().perform();
     //actions2.click();
     Thread.sleep(5000);
    
		//scroll
        JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10)");
		   
		 
		  
		 WebElement E = (driver.findElement(By.xpath("//label[text()='Roadster']")));
		 E.click();
		 
		WebElement E1 = (driver.findElement(By.xpath("//label[text()='Rs. 624 to Rs. 1049']")));
	    E1.click();
		
	     WebElement E2 = (driver.findElement(By.xpath("//label[text()='40% and above']")));
		 E2.click();
		 
		// selct product
		 driver.findElement(By.xpath("//ul[@class='results-base']//li[1]")).click();
		 
		 //driver.switchTo().newWindow(Web);
		 //driver.switchTo().window(driver.getTitle());
		 
		 Set<String> Windeow = driver.getWindowHandles();
		for (String string : Windeow) {
			driver.switchTo().window(string);
		}
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		
		//select size
		 driver.findElement(By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[1]")).click();
		
		 //div[text()='ADD TO BAG']
		 //ad to bag
		 driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click();
		//go to bag
		 
		 driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		 //move to wishlist
		 driver.findElement(By.xpath("//button[text()='MOVE TO WISHLIST']")).click();
		 
		 //driver.close();
		 
}
}
