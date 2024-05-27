package com.haceb.steps;

import com.haceb.pageObject.RegistroPageObject;
import com.haceb.utils.CambioVentana;
import com.haceb.utils.Excel;
import com.haceb.utils.Lista;
import com.haceb.utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.haceb.utils.EsperasExplicitas.esperarClick;
import static com.haceb.utils.EsperasExplicitas.esperarElemento;
import static com.haceb.utils.Scroll.scrollElemento;



public class RegistroStep {
    public String rutaExcel="src/test/resources/data/Datos.xlsx";

    @Page
    private RegistroPageObject registroPageObject;
    private Excel excel;
    private CambioVentana cambioVentana;
    private Lista lista;
    private Scroll scroll;


    @Step("click aun no te has registrado")
    public void clickSinRegistro() {
        CambioVentana ventana = new CambioVentana();
        ventana.cambioDeVentana();
        esperarElemento(registroPageObject.getDriver(),registroPageObject.getBtnSinRegistar());
        registroPageObject.getDriver().findElement(registroPageObject.getBtnSinRegistar()).click();
    }

    @Step("diligenciar formulario registro")
    public void formulario1() {
        esperarElemento(registroPageObject.getDriver(),registroPageObject.getTxtCorreo());
        registroPageObject.getDriver().findElement(registroPageObject.getTxtCorreo()).sendKeys(Excel.leerDatosExcel(rutaExcel,"Hoja1",1,0));
        registroPageObject.getDriver().findElement(registroPageObject.getTxtNombre()).sendKeys(Excel.leerDatosExcel(rutaExcel,"Hoja1",1,1));
        registroPageObject.getDriver().findElement(registroPageObject.getTxtApellido()).sendKeys(Excel.leerDatosExcel(rutaExcel,"Hoja1",1,2));
        registroPageObject.getDriver().findElement(registroPageObject.getTxtContrasena()).sendKeys(Excel.leerDatosExcel(rutaExcel,"Hoja1",1,3));
        registroPageObject.getDriver().findElement(registroPageObject.getTxtConfirmar()).sendKeys(Excel.leerDatosExcel(rutaExcel,"Hoja1",1,4));
        scrollElemento(registroPageObject.getDriver(),registroPageObject.getBtnRegistrarme());
        registroPageObject.getDriver().findElement(registroPageObject.getChkTermino()).click();
        registroPageObject.getDriver().findElement(registroPageObject.getRdbAutorizo()).click();
        registroPageObject.getDriver().findElement(registroPageObject.getBtnRegistrarme()).click();
        esperarElemento(registroPageObject.getDriver(),registroPageObject.getTxtCedula());
        registroPageObject.getDriver().findElement(registroPageObject.getTxtCedula()).sendKeys(Excel.leerDatosExcel(rutaExcel,"Hoja1",1,5));
        registroPageObject.getDriver().findElement(registroPageObject.getLstGenero()).click();
        registroPageObject.getDriver().findElement(registroPageObject.getBtnGenero()).click();
        registroPageObject.getDriver().findElement(registroPageObject.getCdrCalendario()).sendKeys(Excel.leerDatosExcel(rutaExcel,"Hoja1",1,7));
        scrollElemento(registroPageObject.getDriver(),registroPageObject.getLstDepartamento());
        esperarElemento(registroPageObject.getDriver(),registroPageObject.getLstDepartamento());
        registroPageObject.getDriver().findElement(registroPageObject.getLstDepartamento()).click();
        registroPageObject.getDriver().findElement(registroPageObject.getBtnDepartamento()).click();
        registroPageObject.getDriver().findElement(registroPageObject.getBtnEnviar()).click();
        esperarClick(registroPageObject.getDriver(),registroPageObject.getBtnEnviar());


    }
}
