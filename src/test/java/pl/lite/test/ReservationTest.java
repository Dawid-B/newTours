package pl.lite.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservationTest {

	WebDriver driver;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}

	@Test
	public void topMenuTest() {
		System.out.println("wewnątrz testu gónego menu");
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void leftMenuTest() {
		System.out.println("wewnątrz testu lewego menu");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.linkText("Car Rentals")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

	@After
	public void tearDown() {
		driver.close();
	}

}
