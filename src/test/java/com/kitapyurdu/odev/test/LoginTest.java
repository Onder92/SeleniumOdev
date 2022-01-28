package com.kitapyurdu.odev.test;

import com.kitapyurdu.odev.driver.BaseTest;
import com.kitapyurdu.odev.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage=new LoginPage();

        loginPage.login();
        loginPage.loginControl();
        loginPage.searchProduct();
    }


}
