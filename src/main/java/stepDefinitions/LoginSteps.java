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
import pages.DashBoardPage;
import pages.LoginPage;
import cucumber.api.java.en.And;

public class LoginSteps {

	public WebDriver driver;
	LoginPage loginpage;
	DashBoardPage dashboardpage;

	@Before
	public void setup() {
		// definir navegador de la automatizacion -emulador-
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// definir una instancia objeto
		driver = new ChromeDriver();
		loginpage = new LoginPage(driver);
		dashboardpage = new DashBoardPage(driver);
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

//	@When("el usuario ingrese una credencial valida")
//	public void usuarioIngresaCredencialesValidas() {
//		// Limipiar datos
//		driver.findElement(By.id("MainContent_txtUserName")).clear();
//		driver.findElement(By.name("ctl00$MainContent$txtPassword")).clear();
//
//		// Caja de Texto Usuari0
//		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("jhonperez@gmail.com");
//		// Caja de texto Password
//		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("nicolas2005");
//
//		/*
//		 * WebElement usuario = driver.findElement(By.id("MainContent_txtUserName"));
//		 * WebElement password = driver.findElement(By.id("MainContent_txtPassword"));
//		 * 
//		 * usuario.sendKeys("jhonperez@gmail.com"); password.sendKeys("nicolas2005");
//		 */
//
//		driver.findElement(By.id("MainContent_btnLogin")).click();
//
//		// System.out.println("Usuario ingreso credenciales en la pagina login");
//	}

	@Then("el usuario puede ver su perfil")
	public void usuarioVeSuPanel() {
		// System.out.println("Usuario accede con exito");
		 String resultado = dashboardpage.checkLogin();
		 assertEquals("Logged in successfully", resultado);

		// cuando no se tiene identificador se utiliza xpath

		//String resultado = driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[1]/h1")).getText();
		//assertEquals("Welcome back!", resultado);
		// driver.close();
	}

//	@When("el usuario ingrese un usuario erroneo")
//	public void usuarioIngresaUsuarioErroneo() {
//		
//		// Caja de Texto Usuario
//		loginpage.ingresarCorreo("jhonperez1@gmail.com");
//		// Caja de texto Password
//		loginpage.ingresarPassword("nicolas2005");
//		
//	}

	@Then("Invalid User Name")
	public void usuarioNoVeSuPanelUsuarioErroneo() throws InterruptedException {
		Thread.sleep(3000);
		String resultado = loginpage.ingresoErroneo();
		assertEquals("Invalid user name, try again!", resultado);

		
	}

//	@When("el usuario ingrese un password erroneo")
//	public void usuarioIngresaPasswordErroneo() {
//		
//
//		// Caja de Texto Usuario
//		loginpage.ingresarCorreo("jhonperez@gmail.com");
//		// Caja de texto Password
//		loginpage.ingresarPassword("nicolas2008");
//		
//	}

	@Then("Invalid Password")
	public void usuarioNoVeSuPanelPasswordErroneo() throws InterruptedException {

		Thread.sleep(3000);
		String resultado = loginpage.ingresoErroneo();
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

	   @When ("el usuario ingrese un (.*)")
	    public void usuarioIngresaCorreoParamterizado(String correo) {
	    	
	    	// Caja de Texto Usuari0
	    	loginpage.ingresarCorreo(correo);
		   	//driver.findElement(By.id("MainContent_txtUserName")).clear();
			//driver.findElement(By.id("MainContent_txtUserName")).sendKeys(correo);
							
	    }
	    @And ("y un (.*)")
	    public void usuarioIngresaPasswordParamterizado(String password) {
	    	// Caja de Texto Password
			loginpage.ingresarPassword(password);
	    	//driver.findElement(By.name("ctl00$MainContent$txtPassword")).clear();
			//driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys(password);
			
	    }
	    
	    @And ("y hace clik en el boton Login")
	    public void usuarioClicBotonLogin() {
	    	loginpage.clickBotonLogin();
	    	
	    	//driver.findElement(By.id("MainContent_btnLogin")).click();
	    }
	    
	    @When ("ingrese un correo erroneo (.*)")
	    public void usuarioIngresaCorreoErroneo(String correo) {
	    	
	    	// Caja de Texto Usuari0
	    	loginpage.ingresarCorreo(correo);
		   	//driver.findElement(By.id("MainContent_txtUserName")).clear();
			//driver.findElement(By.id("MainContent_txtUserName")).sendKeys(correo);
							
	    }
	    
	    @And ("password erroneo (.*)")
	    public void usuarioIngresaPasswordErroneo(String password) {
	    	// Caja de Texto Password
			loginpage.ingresarPassword(password);
	    	//driver.findElement(By.name("ctl00$MainContent$txtPassword")).clear();
			//driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys(password);
			
	    }
	    

}
