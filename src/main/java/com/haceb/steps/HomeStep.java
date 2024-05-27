package com.haceb.steps;

import com.haceb.pageObject.HomePageObject;
import com.haceb.pageObject.RegistroPageObject;
import com.haceb.utils.CambioVentana;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.haceb.utils.EsperasExplicitas.esperarElemento;
public class HomeStep {
   @Page
   private HomePageObject homePage;

    @Step("el usuario ingresa a la url")
    public void openUrl() {homePage.openUrl("https://www.haceb.com/");}

    @Step("click cerrar")
    public void clickCerrar() {

        esperarElemento(homePage.getDriver(),homePage.getBtnCerrar());
        homePage.getDriver().findElement(homePage.getBtnCerrar()).click();}

    @Step("click boton entrar")
    public void clikcEntrar() {homePage.getDriver().findElement(homePage.getBtnEntrar()).click();}

    @Step("click registro")
    public void clickRegistro() {homePage.getDriver().findElement(homePage.getBtnRegistro()).click();}





    }

