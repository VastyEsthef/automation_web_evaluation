package com.nttdata.steps;


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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmationText = wait.until(ExpectedConditions.visibilityOfElementLocated(
                PopupConfirmationProductsPageMyStore.popupConfirmationProducts));
        return confirmationText.getText();
        //return this.driver.findElement(PopupConfirmationProductsPageMyStore.popupConfirmationProducts).getText();


    }
}
