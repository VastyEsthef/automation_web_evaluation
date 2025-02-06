package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CategoryMyStoreSteps;
import com.nttdata.steps.LoginMyStoreSteps;
import com.nttdata.steps.PopupConfirmationProductsMyStoreSteps;
import com.nttdata.steps.SelectProductsSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginMyStoreStepsDef {

    private WebDriver driver;

    private PopupConfirmationProductsMyStoreSteps popupConfirmationProductsMyStoreSteps(WebDriver driver){
        return new PopupConfirmationProductsMyStoreSteps(driver);
    }

    @Dado("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion?back=https%3A%2F%2Fqalab.bensg.com%2Fstore%2Fpe%2F");
        screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void me_logueo_con_mi_usuario_y_clave(String email, String password) {
        LoginMyStoreSteps loginMyStoreSteps = new LoginMyStoreSteps(driver);
        loginMyStoreSteps.typeEmail(email);
        loginMyStoreSteps.typePassword(password);
        loginMyStoreSteps.login();
        screenShot();
    }

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navego_a_la_categoria_Clothes_y_subcategoria_Men(String clothes, String men) {
        CategoryMyStoreSteps categoryMyStoreSteps = new CategoryMyStoreSteps(driver);
        categoryMyStoreSteps.navegarClothes();
        //categoryMyStoreSteps.navegarMen();
        screenShot();
    }

    @Y("agrego 2 unidades del primer producto al carrito")
    public void agrego_2_unidades_del_primer_producto_al_carrito() {
        SelectProductsSteps selectProductsSteps = new SelectProductsSteps(driver);
        selectProductsSteps.selectProduct();
        screenShot();
    }
    @Entonces("valido en el popup la confirmación del producto agregado")
    public void valido_en_el_popup_la_confirmación_del_producto_agregado() {
        String title =  popupConfirmationProductsMyStoreSteps(driver).getConfirmationPopup();
        System.out.println("***************");
        //System.out.println(title);
        Assertions.assertEquals("Hay 2 artículos en su carrito.", title);
    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void valido_en_el_popup_que_el_monto_total_sea_calculado_correctamente() {
        String totalPrice =  popupConfirmationProductsMyStoreSteps(driver).getConfirmationTotalPricePopup();
        System.out.println("***************");
        System.out.println(totalPrice);
        Assertions.assertEquals("S/ 38.24", totalPrice);
    }

    @Cuando("finalizo la compra")
    public void finalizo_la_compra() {
        PopupConfirmationProductsMyStoreSteps popupConfirmationProductsMyStoreSteps = new PopupConfirmationProductsMyStoreSteps(driver);
        System.out.println("Antes del: Finalizó compra y cerro el popup");
        popupConfirmationProductsMyStoreSteps.completePurchasePopup();
        System.out.println("Finalizó compra y cerro el popup");
        screenShot();

    }
}
