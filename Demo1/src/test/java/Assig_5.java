import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assig_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();
		
		driver1.manage().window().maximize();
		driver1.get("http://qatechhub.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.get("https://www.facebook.com");//wait fully loaded
		driver1.navigate().back();
		System.out.println(driver1.getCurrentUrl());
		driver1.navigate().forward();
		driver1.navigate().refresh();
		driver1.close();
}
}