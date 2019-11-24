package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lite.test.Init;

public class MainPage {

	WebDriver driver;
	// main page part
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;

	@FindBy(linkText = "REGISTER")
	WebElement registerLink;

	// login page start
	@FindBy(name = "userName")
	WebElement loginInput;

	@FindBy(name = "password")
	WebElement passwInput;

	@FindBy(name = "login")
	WebElement loginBtn;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	public void goToLoginPage() {

		signOnLink.click();
	}

	public void loginAs(String login, String password) {

		loginInput.sendKeys(login);
		passwInput.sendKeys(password);
		loginBtn.click();
	}
	
	
}
