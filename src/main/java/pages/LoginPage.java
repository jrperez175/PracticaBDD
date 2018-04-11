package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public void ingresarCorreo(String email) {
		// Caja de Texto Usuario
		driver.findElement(By.id("MainContent_txtUserName")).clear();
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(email);

	}

	public void ingresarPassword(String password) {
		// Caja de texto Password
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).clear();
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys(password);
	}

	public void clickBotonLogin() {
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}

	public void clicLinkOlvidoPassword() {
		driver.findElement(By.linkText("Forgot password?")).click();
	}

	public void clicBotonCrearCuenta() {
		driver.findElement(By.cssSelector("a.btn.btn-default")).click();
	}
	
	public String ingresoErroneo() {
		return driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
	}
	
	
	
	public LoginPage(WebDriver driver) { // constructor
		this.driver = driver;

	}
}
