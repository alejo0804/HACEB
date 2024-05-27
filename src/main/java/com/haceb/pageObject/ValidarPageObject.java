package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarPageObject extends PageObject {
    private final By lblValidarUser = By.cssSelector("div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) button:nth-child(1) div:nth-child(1) span:nth-child(1) div:nth-child(2) div:nth-child(1) span:nth-child(1)");
    public By getLblValidarUser() {return lblValidarUser;}


}
