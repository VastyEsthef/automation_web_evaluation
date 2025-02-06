package com.nttdata.steps;

import com.nttdata.page.LoginPageMyStore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginMyStoreSteps {

    private WebDriver driver;
    //constructor
    public LoginMyStoreSteps(WebDriver driver){
        this.driver = driver;
    }
    //EMAIL
    public void typeEmail(String email){
        WebElement userInputElement = driver.findElement(LoginPageMyStore.emailInput);
        userInputElement.sendKeys(email);
        //Espera Explicita
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageMyStore.loginButton));

    }

    //PASSWORD
    public void typePassword(String password){
        this.driver.findElement(LoginPageMyStore.passInput).sendKeys(password);
    }
    // BUTTON
    public void login(){
        this.driver.findElement(LoginPageMyStore.loginButton).click();
    }

}
