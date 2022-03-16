package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Favorites_page;
import pages.Home;

public class test_three {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	protected Home home;
	protected Favorites_page favorite;
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
		driver.navigate().to(baseUrl + "");
		// System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		home.favorites().click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//*[@id=\"favorite_listings_panel\"]/div/div[1]/ul/li[1]/div/button")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className(
				"collection-list-overlay-view wt-display-flex-md wt-pb-xs-0 wt-pb-md-4 wt-overlay--animation-done")));
		WebElement remove = driver.findElement(
				By.xpath("//*[@id='user-lists-overlay']/div/div/div[1]/fieldset/div/span[2]/label/div[2]/span"));
		js.executeScript("arguments[0].click()", remove);
	}

}
