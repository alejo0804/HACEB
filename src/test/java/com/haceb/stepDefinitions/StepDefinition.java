package com.haceb.stepDefinitions;


import com.haceb.steps.HomeStep;
import com.haceb.steps.RegistroStep;
import com.haceb.steps.ValidadorStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinition {

    @Steps
    private HomeStep homeSteps;

    @Steps
    private RegistroStep registroStep;

    @Steps
    private ValidadorStep validadorStep;
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

    @Given("el usuario ingresa a la Url de haceb")
    public void elUsuarioIngresaALaUrlDeHaceb() {
        homeSteps.openUrl();
    }

    @When("el usuario diligencia formulario de registro")
    public void elUsuarioDiligenciaFormularioDeRegistro() {
        homeSteps.clickCerrar();
        homeSteps.clikcEntrar();
        homeSteps.clickRegistro();
        registroStep.clickSinRegistro();
        registroStep.formulario1();
        //homeSteps.openUrl();
    }

    @Then("el usuario valida registro exitoso")
    public void elUsuarioValidaRegistroExitoso() {
        validadorStep.igual();
    }

    @After
    public void finalizar(){
        if (driver !=null){
            driver.quit();
        }
    }

}