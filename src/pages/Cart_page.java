package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart_page {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public WebElement saveForLater() {
		return driver.findElement(By.xpath(
				"//*[@id=\"multi-shop-cart-list\"]/div[1]/div/div[1]/ul/li/ul/li/div/div[2]/div/div[1]/div[4]/ul/li[1]/a"));
	}

	public WebElement removeBtn() {
		return driver.findElement(By.xpath(
				"//*[@id=\"multi-shop-cart-list\"]/div[1]/div/div[1]/ul/li/ul/li/div/div[2]/div/div[1]/div[4]/ul/li[2]/a"));
	}

	public String getMessage() {
		return driver.findElement(By.className("wt-text-heading-01 wt-pt-xs-2 wt-pb-xs-2")).getText();
	}

	public WebElement gift() {
		return driver.findElement(By.id("gift-checkbox-Lovrishbeauty-input"));
	}

	public Select getQuantity() {
		WebElement quantity = driver.findElement(By.name("listing-quantity"));
		Select select = new Select(quantity);
		return select;
	}

	public WebElement payByCard() {
		return driver.findElement(By.id("256a8bc_multiple_payment_method_credit_card"));
	}

	public WebElement payByPayPal() {
		return driver.findElement(By.id("256a8bc_multiple_payment_method_paypal"));
	}

	public WebElement proceedToCheckout() {
		return driver.findElement(By.className("proceed-to-checkout"));
	}

	public String shipping() {
		return driver
				.findElement(
						By.xpath("//*[@id=\"multi-shop-cart-list\"]/div[1]/div/div[1]/ul/li/div[4]/div[2]/div/div"))
				.getText();
	}

}
