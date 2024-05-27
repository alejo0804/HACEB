package com.haceb.steps;

import com.haceb.models.NameProductModel;
import com.haceb.pageObject.PayProductObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PayProductStep {

    @Page
    private PayProductObject payProduct;

    @Step("Assertions")
    public void validarProducto() {

        assertEquals(
                NameProductModel.getNameProduct(),
                payProduct.getDriver().findElement(payProduct.getLnkNameProduct()).getText());
    }

}
