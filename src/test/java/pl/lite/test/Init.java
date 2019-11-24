package pl.lite.test;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {
	
	static WebDriver driver = null; //null po to, żeby nie wywoływało przeglądarki jeśli już jest odpalona po to jest poniższy if
	
	public static WebDriver getDriver() {
		
		if (driver == null) { //odpala przeglądarkę jeśli jej nie ma "if"
		System.setProperty("webdriver.chrome.driver", "C:/Users/dawid/Desktop/Selenium/chromedriver.exe");				
		//driver = new ChromeDriver();
		URL remoteAddress = null;
		try {
			remoteAddress = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  //tyle czeka na wywołanie strony
		
		Dimension rozmiarOkna = driver.manage().window().getSize();// zabawka do wyświetlania rozmiaru okna
		int wys = rozmiarOkna.height;
		int szer = rozmiarOkna.width;
		System.out.println("rozmoar okna" + "to: " + wys + "x" + szer);
		
			
		driver.get("http://newtours.demoaut.com/");		
		return driver;
		} else {   //jeśli nie ma przeglądarki czyli driver=null odpala przeglądarkę
			return driver;
		}
	}

	public static void end() {
		driver.quit();
		driver = null;
	}
	
}
