package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	@Given("Dado que el usuario esta en la pagina de Login")
	public void usuarioEstaEnPaginaLogin() {
		//definir navegador de la automatizacion -emulador-
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		
		//definir una instancia objeto
		WebDriver driver = new ChromeDriver();
		
		// Maximizar la ventana del navegador
		driver.manage().window().maximize();
				
		//System.out.println("Usuario esta en la pagina de login");
	}
    @When ("el usuario ingrese una credencial valida")
    public void usuarioIngresaCredencialesValidas() {
    	System.out.println("Usuario ingreso credenciales en la pagina login");
    }
    @Then ("el usuario puede ver su perfil")
    public void usuarioVeSuPanel() {
    	System.out.println("Usuario accede con exito");
    }

}
