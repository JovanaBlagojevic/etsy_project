package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Favorites_page {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public WebElement favoriteFirstItem() {
		return driver.findElement(By.xpath("//*[@id=\"favorite_listings_panel\"]/div/div[1]/ul/li[1]/div/button"));
	}

}
