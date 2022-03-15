package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Clothing_page;
import pages.Home;
import pages.Women_clothing;

public class test_two {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	protected Home home;
	protected Clothing_page clothing;
	protected Women_clothing women;
	String baseUrl = "https://www.etsy.com";
	Actions action = new Actions(driver);

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
		action.moveToElement(home.clothing());
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.className("top-nav-item wt-pb-xs-2 wt-mr-xs-2 wt-display-flex-xs wt-align-items-center active")));
		home.clothing().click();
		Thread.sleep(700);
		women.filtersBtn().click();
		women.freeShippingBtn();
		women.oneDay();
		women.anyPrice();
		women.beige();
		women.anywhereShop();
		women.allItems();
		women.shipTo("Serbia");
		women.applyBtn();
		Thread.sleep(1000);
		driver.navigate().to(baseUrl
				+ "/listing/159813779/pearl-ivory-leather-ballet-flats-with?click_key=ec3ae322fa6567f3ebf16db741b77f6a0c951b8a%3A159813779&click_sum=6f5b8742&ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=&ref=sr_gallery-1-9&etp=1");

		Select dropdown = new Select(driver.findElement(By.id("inventory-variation-select-0")));
		dropdown.selectByValue("544530076");

		driver.findElement(By.xpath("//*[@id=\"listing-page-cart\"]/div[3]/div/div[2]/div/form/div/button")).click();
	}

}
