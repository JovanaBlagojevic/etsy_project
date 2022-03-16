package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Home;
import pages.SignIn_register_tab;

public class test_five {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	protected Home home;
	protected SignIn_register_tab signin;
	String baseUrl = "https://www.etsy.com";

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();

	}

	@Test
	public void test() {
		home.signIn().click();
		signin.email().sendKeys("jojo.thefunsideoflife@gmail.com");
		signin.password().sendKeys("1234567");
		signin.staySignIn().click();
		signin.signInBtn().click();
	}
}
