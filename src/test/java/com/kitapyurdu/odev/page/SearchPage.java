package com.kitapyurdu.odev.page;

import com.kitapyurdu.odev.methods.Methods;
import org.openqa.selenium.By;

public class SearchPage {
    Methods methods;

    public SearchPage(){

        methods=new Methods();
    }

    public void scrollToSeventh(){
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.id("faceted-search-group-6"));
    }
    public void addFavorite(){
        methods.click(By.cssSelector("div[id='product-394421'] i[class='fa fa-heart']"));
        methods.click(By.cssSelector("div[id='product-341772'] i[class='fa fa-heart']"));
        methods.click(By.cssSelector("div[id='product-395206'] i[class='fa fa-heart']"));
        methods.click(By.cssSelector("div[id='product-596239'] i[class='fa fa-heart']"));
        }

    }
