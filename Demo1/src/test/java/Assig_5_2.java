import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assig_5_2 {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\msedgedriver.exe");

	WebDriver driver2 = new EdgeDriver();
	driver2.manage().window().maximize();
	driver2.get("http://qatechhub.com");
	System.out.println(driver2.getTitle());
	System.out.println(driver2.getCurrentUrl());
	driver2.get("https://www.facebook.com");//wait fully loaded
	driver2.navigate().back();
	System.out.println(driver2.getCurrentUrl());
	driver2.navigate().forward();
	driver2.navigate().refresh();
	driver2.close();
	}
	

}
