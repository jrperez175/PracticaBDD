package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;



public class RegistroSteps {

//	public WebDriver driver;
//
//	@Before
//	public void setup() {
//		// definir navegador de la automatizacion -emulador-
//		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
//
//		// definir una instancia objeto
//		driver = new ChromeDriver();
//	}
//	
//	@After
//	public void tearDown() {
//		driver.close();
//	}
//	
//	@Given("Dado que el usuario esta en la pagina de Login")
//	public void usuarioEstaEnPaginaLogin() {
//
//		String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
//
//		// Maximizar la ventana del navegador
//		driver.manage().window().maximize();
//
//		// Ingresar a la URL
//		driver.get(url);
//
//		// System.out.println("Usuario esta en la pagina de login");
//	}
//	
//	@When ("el usuario da click en el boton crear cuenta")
//	 public void usuarioDaClickBotonCrearCuenta() {
//		 driver.findElement(By.cssSelector("a.btn.btn-default")).click();
//		 //driver.findElement(By.linkText("CREATE ACCOUNT")).click();
//	 }
//	    @And ("el usuario ingresa su nombre")
//	    public void usuarioIngresaNombre() {
//	    	driver.findElement(By.id("MainContent_txtFirstName")).sendKeys("Jhon R Perez");
//	    }
//	    
//	    @And ("correo (.*)")
//	    public void usuarioIngresaEmail(String email) throws InterruptedException {
//	    	driver.findElement(By.id("MainContent_txtEmail")).sendKeys(email);
//	    	Thread.sleep(3000);
//	    }
//	    @And ("el usuario ingresa telefono")
//	    public void usuarioIngresaTelefono() {
//	    	driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys("231345");
//	    }
//	    @And ("el usuario selecciona el genero")
//	    public void usuarioSeleccionaGenero() {
//	    	driver.findElement(By.id("MainContent_Female")).click();
//	    }
//	    @And ("password (.*)")
//	    public void usuarioIngresaPassword(String password ) {
//	    	driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
//	    }
//	    @And ("verifica su password (.*)")
//	    public void usuarioIngresaVerificacionPassword(String repassword) {
//	    	driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys(repassword);
//	    }
//	    @And ("pais (.*)")
//	    public void usuarioSeleccionaPais(String pais) {
//	    	Select comboPais = new Select(driver.findElement(By.id("MainContent_menuCountry")));
//	    	comboPais.selectByValue(pais);
//	    	
//	    }
//	    @And ("el usuario selecciona la suscripcion")
//	    public void usuarioSeleccionaSuscripcion() {
//	    	driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
//	    }
//	    @And ("el usuario da click en el boton submitir")
//	    public void usuarioClickBotonSubmitir() {
//	    	driver.findElement(By.id("MainContent_btnSubmit")).click();
//	    	
//	    }
//	    
//	    @Then ("la cuenta fue creada con exito")
//	    public void usuarioCreaCuentaExitosa() throws InterruptedException {
//	    	Thread.sleep(3000);
//	    	String resultado = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
//	    	assertEquals("Customer information added successfully", resultado);
//	    }
//	    
//	
//	
	
}
