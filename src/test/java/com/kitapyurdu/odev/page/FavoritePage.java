package com.kitapyurdu.odev.page;

import com.kitapyurdu.odev.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class FavoritePage {
    Methods methods;
    Logger logger = LogManager.getLogger(FavoritePage.class);
    public FavoritePage(){
        methods=new Methods();
    }
    public void selectFavorites(){
        methods.click(By.cssSelector("div[class='menu top my-list'] "));
        methods.click(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[1]/a[1]"));
        methods.waitBySeconds(3);

    }
    public void favoriteControl(){
        String favText=methods.getText(By.cssSelector("div[class='results']"));
        System.out.println("Favoriler: "+favText);
        logger.info("Favoriler: "+favText);
    }

    }

