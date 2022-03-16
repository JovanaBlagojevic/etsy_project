package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Home;
import pages.SignIn_register_tab;

public class Register_test {
	//Registering on Etsy website 
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	protected Home home;
	protected SignIn_register_tab srt;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.etsy.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		js.executeScript("arguments[0].click()", home.signIn());
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("wt-overlay--animation-done")));
		srt.register().click();
		Thread.sleep(200);
		srt.email().sendKeys("jovana@gmail.com");
		srt.firstName().sendKeys("Jovana");
		srt.password().sendKeys("123456789");
		srt.registerBtn().click();
		Thread.sleep(300);
		wait.until(ExpectedConditions
				.visibilityOf((WebElement) By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[3]/div/button")));

		Boolean isPresented = driver
				.findElements(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[3]/div/button")).size() > 0;
		Assert.assertTrue(isPresented, "[ERROR: Account wasn't created!]");
	}

}
