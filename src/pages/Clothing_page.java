package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clothing_page {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public WebElement women() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/a"));
	}

	public WebElement men() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/a"));
	}

	public WebElement kids() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/a"));
	}

	public WebElement bags() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[2]/div[2]/div/div/div[4]/a"));
	}

}
