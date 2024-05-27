package com.haceb.pageObject;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HacebProductPageObject extends PageObject {

    private final By btncategorias = By.xpath("(//div[contains(@role,'presentation')])[4]");

    public By getBtncategorias()

    {return btncategorias;}

    private final By lstsubcategorias = By.xpath("//*[@class='vtex-menu-2-x-menuContainer vtex-menu-2-x-menuContainer--department vtex-menu-2-x-menuContainer--department-3 list flex pl0 mv0 flex-column']");

    public By getLstsubcategorias()

    {return lstsubcategorias;}

    private final By btnproducto = By.xpath("//*[@id='gallery-layout-container']");
    public By getBtnproducto()

    {return btnproducto;}

    private final By btncarrito = By.xpath("//div[contains(@class,'vtex-flex-layout-0-x-flexColChild vtex-flex-layout-0-x-flexColChild--add-to-cart pb0')]//button[contains(@type,'button')]");
    public By getBtncarrito()

    {return btncarrito;}

    private final By btngocar = By.xpath("//*[@class='vtex-minicart-2-x-minicartIconContainer gray relative'][1]");

    public By getBtngocar()

    {return btngocar;}

    private final By lblValdiarItemCarrito = By.xpath("//div[contains(@class,'pr5 mw6-ns lh-copy')]");

    public By getLblValdiarItemCarrito()

    {return lblValdiarItemCarrito;}

    private final By BtnDivSubCategoria = By.xpath("//*[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--menu-list']");

    public By getBtnDivSubCategoria()

    {return BtnDivSubCategoria;}

    private final By BtnDivSeleccionProducto = By.xpath("//*[@id='gallery-layout-container']");

    public By getBtnDivSeleccionProducto()

    {return BtnDivSeleccionProducto;}

}
