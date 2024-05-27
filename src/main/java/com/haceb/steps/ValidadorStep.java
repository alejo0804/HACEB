package com.haceb.steps;


import com.haceb.pageObject.HomePageObject;
import com.haceb.pageObject.ValidarPageObject;
import com.haceb.utils.CambioVentana;
import com.haceb.utils.Excel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.haceb.utils.EsperasExplicitas.esperarElemento;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidadorStep {

    public String rutaExcel="src/test/resources/data/Datos.xlsx";
    @Page
    private ValidarPageObject validarPageObject;
    private HomePageObject homePage;

    @Step("comparar nombres del ingresado al registrado")

    public void igual() {
        CambioVentana ventana = new CambioVentana();
        ventana.cambioDeVentana();
        esperarElemento(homePage.getDriver(),homePage.getBtnCerrar());
        homePage.getDriver().findElement(homePage.getBtnCerrar()).click();
        String datoExcel = "Hola, "+Excel.leerDatosExcel(rutaExcel,"Hoja1",1,0);
        WebElementFacade textoLocalizador = homePage.find(validarPageObject.getLblValidarUser());
        String displayedText = textoLocalizador.getText();
        assertThat(displayedText).isEqualTo(datoExcel);
    }
}
