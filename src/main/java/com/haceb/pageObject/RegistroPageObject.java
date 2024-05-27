package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPageObject extends PageObject {

    private final By btnSinRegistar = By.xpath("//a[@title='¿AÚN NO TE HAS REGISTRADO?']");

    public By getBtnSinRegistar() {
        return btnSinRegistar;
    }
    private final By formresgistro = By.xpath("//form[@id='gigya-register-form']");

    private final By txtCorreo = By.xpath("//input[@id='gigya-loginID-51216659851706440']");

    private final By txtNombre = By.xpath("//input[@id='gigya-textbox-72173553995486780']");

    private final By txtApellido = By.xpath("//input[@id='gigya-textbox-146410824335495100']");

    private final By txtContrasena = By.xpath("//input[@id='gigya-password-54061940132406190']");

    private final By txtConfirmar = By.xpath("//input[@id='gigya-password-142670944012194750']");

    private final By chkTermino = By.xpath("(//span[@data-translation-key='CHECKBOX_70031539084410860_LABEL'])[3]");
    private final By rdbAutorizo = By.xpath("(//label[@data-translation-key='MULTICHOICE_109350074984747230_CHOICES_B326B5062B2F0E69046810717534CB09'])[2]");
    private final By btnRegistrarme = By.xpath("//input[@value='REGISTRARME']");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getTxtConfirmar() {
        return txtConfirmar;
    }

    public By getChkTermino() {
        return chkTermino;
    }

    public By getRdbAutorizo() {
        return rdbAutorizo;
    }

    public By getBtnRegistrarme() {
        return btnRegistrarme;
    }
    public By getFormresgistro() { return formresgistro; }

    private final By TxtCedula = By.xpath("(//input[@id='gigya-textbox-153635908553265760'])[2]");
    private final By lstGenero = By.xpath("//select[@id='gigya-dropdown-153944062160082270']");
    private final By btnGenero = By.xpath("//select[@id='gigya-dropdown-153944062160082270']/option[@value='f']");
    private final By cdrCalendario = By.xpath("//input[@id='gigya-textbox-29430652596742216']");
    private final By lstDepartamento = By.xpath("//*[@id='gigya-dropdown-92626747568210580']");
    private final By btnDepartamento = By.xpath("//select[@id='gigya-dropdown-92626747568210580']/option[@value='Amazonas']");
    private final By BtnEnviar = By.xpath("//input[@value='Enviar']");


    public By getTxtCedula() {
        return TxtCedula;
    }

    public By getLstGenero() {
        return lstGenero;
    }

    public By getCdrCalendario() {
        return cdrCalendario;
    }

    public By getLstDepartamento() {
        return lstDepartamento;
    }

    public By getBtnGenero() {return btnGenero;}

    public By getBtnDepartamento() {return btnDepartamento;}

    public By getBtnEnviar() {
        return BtnEnviar;
    }
}
