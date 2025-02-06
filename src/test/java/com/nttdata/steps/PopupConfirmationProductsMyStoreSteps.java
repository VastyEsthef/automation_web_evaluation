package com.nttdata.steps;


import com.nttdata.page.CategoryPageMyStore;
import com.nttdata.page.PopupConfirmationProductsPageMyStore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopupConfirmationProductsMyStoreSteps {

    private WebDriver driver;
    //constructor
    public PopupConfirmationProductsMyStoreSteps(WebDriver driver){
        this.driver = driver;
    }

    // Obtener la confirmacion de que hay 2 productos en el carrito
    public String getConfirmationPopup(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement confirmationText = wait.until(ExpectedConditions.visibilityOfElementLocated(
                PopupConfirmationProductsPageMyStore.popupConfirmationProducts));
        return confirmationText.getText();
        //return this.driver.findElement(PopupConfirmationProductsPageMyStore.popupConfirmationProducts).getText();

    }

    // Obtener el precio total de los 2 productos del carrito
    public String getConfirmationTotalPricePopup(){

        return this.driver.findElement(PopupConfirmationProductsPageMyStore.popupConfirmationPriceProducts).getText();
    }

    // Finalizar compra
    public void completePurchasePopup(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmationPurchase = wait.until(ExpectedConditions.visibilityOfElementLocated(
                PopupConfirmationProductsPageMyStore.popupCompletePurchaseButton));
        confirmationPurchase.click();

        //this.driver.findElement(PopupConfirmationProductsPageMyStore.popupCompletePurchaseButton).click();

    }
}
