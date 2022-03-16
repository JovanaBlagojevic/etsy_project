package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn_register_tab {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public WebElement register() {
		return driver.findElement(By.className("select-register"));
	}

	public WebElement email() {
		return driver.findElement(By.id("join_neu_email_field"));
	}

	public WebElement firstName() {
		return driver.findElement(By.id("join_neu_first_name_field"));
	}

	public WebElement password() {
		return driver.findElement(By.id("join_neu_password_field"));
	}

	public WebElement registerBtn() {
		return driver.findElement(By.name("submit_attempt"));
	}

	public WebElement staySignIn() {
		return driver.findElement(By.id("persisent"));
	}

	public WebElement signInBtn() {
		return driver.findElement(By.name("submit_attempt"));
	}

}
