package com.kitapyurdu.odev.page;

import com.kitapyurdu.odev.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    Logger logger = LogManager.getLogger(FavoritePage.class);
    public LoginPage(){methods=new Methods();}

    public void login(){

        methods.waitBySeconds(2);
        methods.click(By.cssSelector("div[class='menu-top-button login']"));
        methods.sendKeys(By.id("login-email"),"onderyerim@gmail.com");
        methods.sendKeys(By.id("login-password"),"q1w2e3r4t5y6_?");
        methods.click(By.cssSelector("button[role='button']"));
        methods.waitBySeconds(5);
    }

    public void loginControl(){
        String text=methods.getText(By.cssSelector("h1[class='section']"));
        methods.isElementVisible(By.cssSelector("h1[class='section']"));
        System.out.println("Bulunduğun sayfa: " +text);
        logger.info("Bulunduğun sayfa: "+text);

    }
    public void searchProduct(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector("span[class='common-sprite button-search']"));

    }
}
