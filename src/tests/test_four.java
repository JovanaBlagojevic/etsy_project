package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Cart_page;
import pages.Home;

public class test_four {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	protected Home home;
	protected Cart_page cart;
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
	public void test() throws InterruptedException {
		home.cart().click();
		Thread.sleep(300);
		cart.removeBtn().click();
		Assert.assertTrue(cart.getMessage().contains("Your cart is empty"), "[ERROR] Your cart is not empty!");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
