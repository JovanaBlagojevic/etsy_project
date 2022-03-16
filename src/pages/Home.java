package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public WebElement signIn() {
		return driver.findElement(By.className("select-signin"));
	}

	public WebElement searchTab() {
		return driver.findElement(By.id("global-enhancements-search-query"));
	}

	public WebElement favorites() {
		return driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[3]/nav/ul/li[2]/span/a"));
	}

	public WebElement cart() {
		return driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[3]/nav/ul/li[3]/span/a"));
	}

	public WebElement clothing() {
		return driver.findElement(By.xpath("//*[@id=\"desktop-category-nav\"]/div[1]/div/ul/li[2]/a"));
	}
	
}
