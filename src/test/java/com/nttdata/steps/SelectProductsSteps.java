package com.nttdata.steps;

import com.nttdata.page.SelectTshirtPageMyStore;
import org.openqa.selenium.WebDriver;

public class SelectProductsSteps {

    private WebDriver driver;
    //constructor
    public SelectProductsSteps(WebDriver driver){
        this.driver = driver;
    }

    // BUTTON
    public void selectProduct(){
        this.driver.findElement(SelectTshirtPageMyStore.t_ShirtButton).click();
        this.driver.findElement(SelectTshirtPageMyStore.select1TshirtButton).click();
        this.driver.findElement(SelectTshirtPageMyStore.addProductsShoppingCartButton).click();
    }
}
