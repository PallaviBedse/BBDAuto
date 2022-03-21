import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     int linkcount = 0;
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\bedse\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://in.yahoo.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.findElement(By.xpath("//h4[text()='Trending Now']")).getText());
			
			
    List<WebElement> links = driver.findElements(By.xpath("//a[@class=' d-ib pb-16 w-85p fc-14th']"));//div[@class='compList lh-l fz-s pl-10 pr-10']
    linkcount = links.size();
    System.out.println("The number of links is"  +  linkcount );
		      
  for (WebElement webElement : links)
  {
    System.out.println(webElement.getText());
					
  }

   for(int i=1;i<links.size();i++)
   {
    if(!(links.get(i).getText().isEmpty()))
    {
      driver.findElement(By.linkText(links.get(i).getText())).click();
	  Thread.sleep(3000);
      driver.navigate().back();
	  Thread.sleep(2000);
		            
    }   
	  return;
	}
		      
				/*
				 * driver.findElement(By.linkText("COVID-19 in India")).click();
				 * driver.navigate().back();
				 * 
				 * driver.findElement(By.linkText("Yogi Adityanath")).click();
				 * driver.navigate().back(); //Jyotiraditya Scindia
				 * driver.findElement(By.linkText("Jyotiraditya Scindia")).click();
				 * driver.navigate().back();
				 * 
				 * driver.findElement(By.linkText("Devendra Fadnavis")).click();
				 * driver.navigate().back();
				 * 
				 * driver.findElement(By.linkText("Virat Kohli")).click();
				 * driver.navigate().back();
				 * driver.findElement(By.linkText("Rupa Dutta")).click();
				 * driver.navigate().back();
				 * driver.findElement(By.linkText("IPL 2022")).click();
				 * driver.navigate().back();
				 * driver.findElement(By.linkText("Lakshya Sen")).click();
				 * driver.navigate().back();
				 * driver.findElement(By.linkText("Rupa Dutta")).click();
				 * driver.navigate().back(); driver.findElement(By.linkText("LIC IPO")).click();
				 * driver.navigate().back();
				 * 
				 * driver.findElement(By.linkText("COVID-19 in India")).click(); //indea
				 * System.out.println(driver.findElement(By.xpath("//div[@class='wrap ']")).
				 * getText()); //Cases
				 * System.out.println(driver.findElement(By.xpath("//span[text()='42,990,991']")
				 * ).getText()); //death
				 * System.out.println(driver.findElement(By.xpath("//td[@class='td3 pl-16']")).
				 * getText());
				 * 
				 */
		}

}
