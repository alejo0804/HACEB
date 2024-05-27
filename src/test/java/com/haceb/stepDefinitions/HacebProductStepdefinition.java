package com.haceb.stepDefinitions;


import com.haceb.pageObject.HomePageObject;
import com.haceb.steps.HacebProductStep;
import com.haceb.steps.HomeStep;
import com.haceb.steps.PayProductStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HacebProductStepdefinition {

    @Steps
    private HomeStep homeSteps;

    @Steps
    private HacebProductStep hacebProductStep;

    @Steps
    private PayProductStep payProductStep;


    WebDriver driver;
    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }
    @BeforeEach
    void setupTest() {driver = new ChromeDriver();
    }
    @AfterEach
    void teardown() {driver.quit();
    }

    @Given("el usuario ingresa a la URL de Haceb")
    public void elUsuarioIngresaALaURLDeHaceb() {
        homeSteps.openUrl();
    }

    @When("selecciona categoría y subcategoría al azar")
    public void seleccionaCategoríaYSubcategoríaAlAzar() {
        hacebProductStep.cerrarVentanaEmergente();
        hacebProductStep.clikcCategorias();
        hacebProductStep.random();
        hacebProductStep.randomSubcategorias();


    }

    @When("elige un producto de forma aleatoria")
    public void eligeUnProductoDeFormaAleatoria() {
        hacebProductStep.randomseleccionproducto();

    }

    @When("lo agrega al carrito")
    public void loAgregaAlCarrito() {
        hacebProductStep.clickagregarcarrito();
        hacebProductStep.gotocar();
    }

    @Then("se valida que sea el producto seleccionado")
    public void seValidaQueSeaElProductoSeleccionado() {
        payProductStep.validarProducto();
        }
}
