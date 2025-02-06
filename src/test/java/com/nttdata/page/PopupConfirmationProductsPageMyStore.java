package com.nttdata.page;

import org.openqa.selenium.By;

public class PopupConfirmationProductsPageMyStore {

    public static By popupConfirmationProducts = By.cssSelector("p.cart-products-count");
    //public static By popupConfirmationProducts = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[1]");
    public static By popupConfirmationPriceProducts = By.cssSelector("span.value");
    public static By popupCompletePurchaseButton = By.cssSelector("#blockcart-modal a.btn-primary");
    //public static By popupCompletePurchaseButton = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
}
