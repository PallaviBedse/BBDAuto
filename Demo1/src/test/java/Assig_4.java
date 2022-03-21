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
     actions.moveToElement(sortBy);
     
     WebElement Popularity = driver.findElement(By.xpath("//label[normalize-space()='Popularity']"));
     actions2.moveToElement(Popularity);
     actions2.click();
     Thread.sleep(2000);
    
		//scroll
        JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10)");
		   
		 // Select select2= new Select(driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")));
		 //select2.selectByVisibleText("Tops");
		 
		 // Select select3= new Select(driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']")));
		//  select3.selectByIndex(1);
		 
		//  Select select4= new
		//  Select(driver.findElement(By.xpath("//ul[@class='discount-list']")));
		//  select4.selectByIndex(3);
		  
		 WebElement E = (driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[2]")));
		 E.isSelected();
		 
		 WebElement E1 = (driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[7]")));
		 E1.isSelected();
		
	     WebElement E2 = (driver.findElement(By.xpath("(//label[@class='common-customRadio vertical-filters-label'])[1]")));
		 E2.isSelected();
		 
		// selct product
		 driver.findElement(By.xpath("//ul[@class='results-base']//li[1]")).click();
		//select size
		 driver.findElement(By.xpath("//div[@id='sizeButtonsContainer']//div[1]//div[1]//button[1]")).click();
		
		 //div[text()='ADD TO BAG']
		 
		 driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click();
		//go to bag
		 driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		 //move to wishlist
		 driver.findElement(By.xpath("//button[text()='MOVE TO WISHLIST']")).click();
		 
		 driver.close();
		 
}
}
