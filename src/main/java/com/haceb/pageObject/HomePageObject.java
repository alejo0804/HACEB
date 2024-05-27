package com.haceb.pageObject;



import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageObject extends PageObject {

private final By btnCerrar = By.xpath("//a[@aria-label='close window']");

    public By getBtnCerrar() {
        return btnCerrar;
    }

    private final By btnEntrar = By.xpath("(//div[contains(@class,'vtex-button__label flex items-center justify-center h-100 ph6')])[1]");

    public By getBtnEntrar() {
        return btnEntrar;
    }

    private final  By btnRegistro = By.xpath("//div[@class='vtex-login-2-x-button vtex-login-2-x-buttonSocial vtex-login-2-x-customOAuthOptionBtn']//button[@type='button']");

    public By getBtnRegistro() {
        return btnRegistro;
    }


}

