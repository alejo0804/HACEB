package com.haceb.utils;

import org.openqa.selenium.By;
import java.time.Instant;
import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class CambioVentana {



    public void cambioDeVentana() {
        String ventanaPrincipal = getDriver().getWindowHandle();
        Set<String> ventanas = getDriver().getWindowHandles();
        for (String ventana : ventanas) {
            if (!ventanaPrincipal.equals(ventana)) {
                getDriver().switchTo().window(ventana);

                break;
            }
        }
    }
}