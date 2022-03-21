import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig_3 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     int linkcount = 0;
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\bedse\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://in.yahoo.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.findElement(By.cssSelector(".title.d-i.fz-s.fw-xl.s-label")).getText());
			
			
    List<WebElement> links = driver.findElements(By.cssSelector("ol[class='reg searchBottom'] li[class='last']"));//div[@class='compList lh-l fz-s pl-10 pr-10']
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
   }
	}