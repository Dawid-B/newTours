package pl.lite.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dawid/Desktop/Selenium/chromedriver.exe");
				
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		return driver;
	}

}
