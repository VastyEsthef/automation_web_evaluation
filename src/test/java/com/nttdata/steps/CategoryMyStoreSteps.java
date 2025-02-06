package com.nttdata.steps;

import com.nttdata.page.CategoryPageMyStore;
import org.openqa.selenium.WebDriver;

public class CategoryMyStoreSteps {

    private WebDriver driver;
    //constructor
    public CategoryMyStoreSteps(WebDriver driver){
        this.driver = driver;
    }

    // BUTTON-CLOTHES
    public void navegarClothes(){
        this.driver.findElement(CategoryPageMyStore.clothesButton).click();
        this.driver.findElement(CategoryPageMyStore.menButton).click();
    }



}
