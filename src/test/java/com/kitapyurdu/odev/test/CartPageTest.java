package com.kitapyurdu.odev.test;

import com.kitapyurdu.odev.driver.BaseTest;
import com.kitapyurdu.odev.page.CartPage;
import com.kitapyurdu.odev.page.LoginPage;
import org.junit.Test;

public class CartPageTest extends BaseTest {
    @Test
    public void loginForCartTest(){

        LoginPage loginPage=new LoginPage();
        loginPage.login();

        CartPage cartPage=new CartPage();
        cartPage.goToCart();
        cartPage.increaseItem();
        cartPage.buyItems();
        cartPage.addressAndPaymentInfo();
        cartPage.isPaymentSuccess();
    }
}
