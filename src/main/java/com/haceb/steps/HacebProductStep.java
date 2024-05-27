package com.haceb.steps;

import com.haceb.pageObject.HacebProductPageObject;
import com.haceb.pageObject.HomePageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.haceb.utils.EsperasExplicitas.esperarElemento;
import static com.haceb.utils.Scroll.scrollElemento;
import static org.assertj.core.api.Assertions.assertThat;

public class HacebProductStep {

    private HacebProductPageObject hacebProductPageObject;
    private HomePageObject homePage;


    @Step("click cerrar ventana emergente")
    public void cerrarVentanaEmergente() {
        esperarElemento(homePage.getDriver(),homePage.getBtnCerrar());
        homePage.getDriver().findElement(homePage.getBtnCerrar()).click();

    }

    @Step("click boton categorias")
    public void clikcCategorias() {hacebProductPageObject.getDriver().findElement(hacebProductPageObject.getBtncategorias()).click();}

    @Step
    public void random() {
        WebElement menuCategorias = hacebProductPageObject.getDriver().findElement(By.xpath("//div[@class='w-100 hacebco-menu-drawer-0-x-itemList']"));
        List<WebElement> divOpciones = menuCategorias.findElements(By.xpath("./div[not(ancestor::a)]"));
        if (!divOpciones.isEmpty()) {
            // Realizar clic aleatorio en un elemento div
            Random rand = new Random();
            int index = rand.nextInt(divOpciones.size());
            divOpciones.get(index).click();
        } else {
            System.out.println("No se encontraron elementos div que cumplan con los criterios de búsqueda.");
        }
    }

    @Step("random subcategorias")
    public void randomSubcategorias(){
        scrollElemento(hacebProductPageObject.getDriver(),hacebProductPageObject.getBtnDivSubCategoria());
        WebElement menuCategorias = hacebProductPageObject.getDriver().findElement(By.xpath("//*[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--menu-list']"));
        List<WebElement> opciones = menuCategorias.findElements(By.tagName("div"));
        Random rand = new Random();
        int index = rand.nextInt(opciones.size());
        opciones.get(index).click();

    }

    @Step("seleccion producto")
    public void randomseleccionproducto(){
        scrollElemento(hacebProductPageObject.getDriver(),hacebProductPageObject.getBtnDivSeleccionProducto());
        WebElement menuCategorias = hacebProductPageObject.getDriver().findElement(By.xpath("//*[@id='gallery-layout-container']"));
        List<WebElement> opciones = menuCategorias.findElements(By.tagName("a"));
        Random rand = new Random();
        int index = rand.nextInt(opciones.size());
        //scrollElemento(hacebProductPageObject.getDriver(),hacebProductPageObject.getBtnproducto());
        opciones.get(index).click();

    }

    @Step("agregar al carrito")
    public void clickagregarcarrito(){
        hacebProductPageObject.getDriver().findElement(hacebProductPageObject.getBtncarrito()).click();}

    @Step("validar en carrito")
    public void gotocar() {
        hacebProductPageObject.getDriver().findElement(hacebProductPageObject.getBtngocar()).click();


    }
    @Step("Validar carrito item")

    public void ValidarItenCarrito(){
        scrollElemento(hacebProductPageObject.getDriver(),hacebProductPageObject.getLblValdiarItemCarrito());
        WebElementFacade textoLocalizador = homePage.find(hacebProductPageObject.getLblValdiarItemCarrito());
        String displayedText = textoLocalizador.getText();
        assertThat(displayedText).isEqualTo("Ítem agregado al carrito");
    }



}



