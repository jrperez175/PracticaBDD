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

public class LoginSteps {

	public WebDriver driver;

	@Before
	public void setup() {
		// definir navegador de la automatizacion -emulador-
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// definir una instancia objeto
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	

	@Given("Dado que el usuario esta en la pagina de Login")
	public void usuarioEstaEnPaginaLogin() {

		String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

		// Maximizar la ventana del navegador
		driver.manage().window().maximize();

		// Ingresar a la URL
		driver.get(url);

		// System.out.println("Usuario esta en la pagina de login");
	}

	@When("el usuario ingrese una credencial valida")
	public void usuarioIngresaCredencialesValidas() {
		// Limipiar datos
		driver.findElement(By.id("MainContent_txtUserName")).clear();
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).clear();

		// Caja de Texto Usuari0
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("jhonperez@gmail.com");
		// Caja de texto Password
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("nicolas2005");

		/*
		 * WebElement usuario = driver.findElement(By.id("MainContent_txtUserName"));
		 * WebElement password = driver.findElement(By.id("MainContent_txtPassword"));
		 * 
		 * usuario.sendKeys("jhonperez@gmail.com"); password.sendKeys("nicolas2005");
		 */

		driver.findElement(By.id("MainContent_btnLogin")).click();

		// System.out.println("Usuario ingreso credenciales en la pagina login");
	}

	@Then("el usuario puede ver su perfil")
	public void usuarioVeSuPanel() {
		// System.out.println("Usuario accede con exito");
		// String resultado = driver.findElement(By.id("conf_message")).getText();
		// assertEquals("Logged in successfully", resultado);

		// cuando no se tiene identificador se utiliza xpath

		String resultado = driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[1]/h1")).getText();
		assertEquals("Welcome back!", resultado);
		// driver.close();
	}

	@When("el usuario ingrese un usuario erroneo")
	public void usuarioIngresaUsuarioErroneo() {
		// Limipiar datos
		driver.findElement(By.id("MainContent_txtUserName")).clear();
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).clear();

		// Caja de Texto Usuari0
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("jhonperez1@gmail.com");
		// Caja de texto Password
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("nicolas2005");
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}

	@Then("Invalid User Name")
	public void usuarioNoVeSuPanelUsuarioErroneo() {

		String resultado = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		assertEquals("Invalid user name, try again!", resultado);

		// driver.close();
	}

	@When("el usuario ingrese un password erroneo")
	public void usuarioIngresaPasswordErroneo() {
		// Limipiar datos
		driver.findElement(By.id("MainContent_txtUserName")).clear();
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).clear();

		// Caja de Texto Usuari0
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("jhonperez@gmail.com");
		// Caja de texto Password
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("nicolas2008");
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}

	@Then("Invalid Password")
	public void usuarioNoVeSuPanelPasswordErroneo() {

		
		String resultado = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		assertEquals("Invalid password, try again!", resultado);

	}

	/*@When("el usuario ingrese un usuario y password en blanco")
	public void usuarioIngresaUsuarioPasswordBlanco() {
		// Limipiar datos
		driver.findElement(By.id("MainContent_txtUserName")).clear();
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).clear();

		// Caja de Texto Usuari0
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("");
		// Caja de texto Password
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("");
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}

	@Then("el usuario no puede ver su perfil, Invalid User Name Password")
	public void usuarioNoVeSuPanelUsernamePaswwordBlnaco() {

		String resultado = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		assertEquals("Invalid user name, try again!", resultado);

	}
	*/

	
	 @When ("el usuario da click en el boton crear cuenta")
	 public void usuarioDaClickBotonCrearCuenta() {
		 driver.findElement(By.cssSelector("a.btn.btn-default")).click();
		 //driver.findElement(By.linkText("CREATE ACCOUNT")).click();
	 }
	    @And ("el usuario ingresa su nombre")
	    public void usuarioIngresaNombre() {
	    	driver.findElement(By.id("MainContent_txtFirstName")).sendKeys("Jhon R Perez");
	    }
	    
	    @And ("y su (.*)")
	    public void usuarioIngresaEmail(String email) throws InterruptedException {
	    	driver.findElement(By.id("MainContent_txtEmail")).sendKeys(email);
	    	Thread.sleep(3000);
	    }
	    @And ("el usuario ingresa telefono")
	    public void usuarioIngresaTelefono() {
	    	driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys("231345");
	    }
	    @And ("el usuario selecciona el genero")
	    public void usuarioSeleccionaGenero() {
	    	driver.findElement(By.id("MainContent_Female")).click();
	    }
	    @And ("el usuario ingresa el password")
	    public void usuarioIngresaPassword() {
	    	driver.findElement(By.id("MainContent_txtPassword")).sendKeys("hola2018");
	    }
	    @And ("el usuario ingresa la verificacion del password")
	    public void usuarioIngresaVerificacionPassword() {
	    	driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys("hola2018");
	    }
	    @And ("el usuario selecciona el pais")
	    public void usuarioSeleccionaPais() {
	    	Select comboPais = new Select(driver.findElement(By.id("MainContent_menuCountry")));
	    	comboPais.selectByValue("Ecuador");
	    	
	    }
	    @And ("el usuario selecciona la suscripcion")
	    public void usuarioSeleccionaSuscripcion() {
	    	driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
	    }
	    @And ("el usuario da click en el boton submitir")
	    public void usuarioClickBotonSubmitir() {
	    	driver.findElement(By.id("MainContent_btnSubmit")).click();
	    	
	    }
	    
	    @Then ("la cuenta fue creada con exito")
	    public void usuarioCreaCuentaExitosa() {
	    	String resultado = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
			assertEquals("Customer information added successfully", resultado);
	    }
	

}
