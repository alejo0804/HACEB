package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PayProductObject extends PageObject {

    private final By lnkNameProduct= By.xpath("//*[@id='name-714']");

    public By getLnkNameProduct() {return lnkNameProduct;
    }
}
