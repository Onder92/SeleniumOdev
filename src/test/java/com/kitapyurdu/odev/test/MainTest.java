package com.kitapyurdu.odev.test;

import com.kitapyurdu.odev.driver.BaseTest;
import com.kitapyurdu.odev.page.*;
import org.junit.Test;

public class MainTest extends BaseTest {
    @Test
    public void mainTest(){
        HomePage homePage=new HomePage();
        homePage.home();

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.loginControl();
        loginPage.searchProduct();

        SearchPage searchPage=new SearchPage();
        searchPage.scrollToSeventh();
        searchPage.addFavorite();

        FavoritePage favoritePage=new FavoritePage();
        favoritePage.selectFavorites();
        favoritePage.favoriteControl();

        homePage.backToHome();
        homePage.catalog();

        TurkishClassicsPage turkishClassicsPage=new TurkishClassicsPage();
        turkishClassicsPage.SelectTurkishClassics();

        HobbyPage hobbyPage=new HobbyPage();
        hobbyPage.SelectHobby();
        hobbyPage.SelectRandomProduct();

        favoritePage.selectFavorites();
        hobbyPage.RemoveToFav();

        CartPage cartPage=new CartPage();
        cartPage.goToCart();
        cartPage.increaseItem();
        cartPage.buyItems();
        cartPage.addressAndPaymentInfo();
        cartPage.isPaymentSuccess();

        homePage.backToHome();
        homePage.logOut();

    }
}
