package com.kitapyurdu.odev.test;

import com.kitapyurdu.odev.driver.BaseTest;
import com.kitapyurdu.odev.page.HomePage;
import org.junit.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void homeTest(){

        HomePage homePage=new HomePage();
        homePage.home();
    }
}
