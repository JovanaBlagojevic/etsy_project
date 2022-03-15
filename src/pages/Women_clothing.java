package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Women_clothing {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public WebElement filtersBtn() {
		return driver.findElement(By.id("search-filter-button"));
	}

	public void freeShippingBtn() {
		driver.findElement(By.name("free_shipping")).click();
	}

	public void onSaleBtn() {
		driver.findElement(By.name("is_discounted")).click();
	}

	public void oneDay() {
		driver.findElement(By.id("max-processing-days-1")).click();
	}

	public void threeDays() {
		driver.findElement(By.id("max-processing-days-3")).click();
	}

	public void anyPrice() {
		driver.findElement(By.id("price-input-0")).click();
	}

	public void under25() {
		driver.findElement(By.id("price-input-1")).click();
	}

	public void between25and50() {
		driver.findElement(By.id("price-input-2")).click();
	}

	public void between50and100() {
		driver.findElement(By.id("price-input-3")).click();
	}

	public void over100() {
		driver.findElement(By.id("price-input-4")).click();
	}

	public void custom() {
		driver.findElement(By.id("price-input-custom")).click();
	}

	public void low(String low) {
		driver.findElement(By.id("search-filter-min-price-input")).sendKeys(low);
	}

	public void high(String high) {
		driver.findElement(By.id("search-filter-max-price-input")).sendKeys(high);
	}

	public void beige() {
		driver.findElement(By.xpath("//*[text()=' Beige ']")).click();
	}

	public void black() {
		driver.findElement(By.xpath("//*[text()=' Black ']")).click();
	}

	public void blue() {
		driver.findElement(By.xpath("//*[text()=' Blue ']")).click();
	}

	public void bronze() {
		driver.findElement(By.xpath("//*[text()=' Bronze ']")).click();
	}

	public void brown() {
		driver.findElement(By.xpath("//*[text()=' Brown ']")).click();
	}

	public void clear() {
		driver.findElement(By.xpath("//*[text()=' Clear ']")).click();
	}

	public void copper() {
		driver.findElement(By.xpath("//*[text()=' Copper ']")).click();
	}

	public void gold() {
		driver.findElement(By.xpath("//*[text()=' Gold ']")).click();
	}

	public void gray() {
		driver.findElement(By.xpath("//*[text()=' Gray ']")).click();
	}

	public void green() {
		driver.findElement(By.xpath("//*[text()=' Green ']")).click();
	}

	public void orange() {
		driver.findElement(By.xpath("//*[text()=' Orange ']")).click();
	}

	public void pink() {
		driver.findElement(By.xpath("//*[text()=' Pink ']")).click();
	}

	public void purple() {
		driver.findElement(By.xpath("//*[text()=' Purple ']")).click();
	}

	public void rainbow() {
		driver.findElement(By.xpath("//*[text()=' Rainbow ']")).click();
	}

	public void red() {
		driver.findElement(By.xpath("//*[text()=' Red ']")).click();
	}

	public void roseGold() {
		driver.findElement(By.xpath("//*[text()=' Rose gold ']")).click();
	}

	public void silver() {
		driver.findElement(By.xpath("//*[text()=' Silver ']")).click();
	}

	public void white() {
		driver.findElement(By.xpath("//*[text()=' White ']")).click();
	}

	public void yellow() {
		driver.findElement(By.xpath("//*[text()=' Yellow ']")).click();
	}

	public void anywhereShop() {
		driver.findElement(By.id("shop-location-input-0")).click();
	}

	public void europeShop() {
		driver.findElement(By.id("shop-location-input-1")).click();
	}

	public void serbiaShop() {
		driver.findElement(By.id("shop-location-input-2")).click();
	}

	public void customShop() {
		driver.findElement(By.id("shop-location-radio-input")).click();
	}

	public void customLocation(String location) {
		driver.findElement(By.id("shop-location-input")).sendKeys(location);
	}

	public void allItems() {
		driver.findElement(By.id("item-type-input-0")).click();
	}

	public void handmade() {
		driver.findElement(By.id("item-type-input-1")).click();
	}

	public void vintage() {
		driver.findElement(By.id("item-type-input-2")).click();
	}

	public void giftCard() {
		driver.findElement(By.id("gift-card")).click();
	}

	public void giftWrap() {
		driver.findElement(By.id("gift-wrap")).click();
	}

	public void customizable() {
		driver.findElement(By.id("customizable")).click();
	}

	public void shipTo(String shipTo) {
		Select dropdown = new Select(driver.findElement(By.id("ship_to_select")));
		dropdown.selectByVisibleText(shipTo);
	}

	public void cancelBtn() {
		driver.findElement(By.id("search-filters-cancel-button")).click();
	}

	public void applyBtn() {
		driver.findElement(By.xpath("//*[@id=\"search-filters-overlay\"]/div/div/div[2]/button[2]")).click();
	}
}
