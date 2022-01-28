package com.kitapyurdu.odev.page;

import com.kitapyurdu.odev.methods.Methods;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;

    public HomePage(){

        methods=new Methods();
    }

    public void home(){

        methods.waitBySeconds(2);
    }
    public void backToHome(){
        methods.click(By.cssSelector("img[title='kitapla buluşmanın en kolay yolu!']"));
    }
    public void catalog(){
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/div[2]/a"));
    }
    public void logOut(){
        methods.click(By.cssSelector("a[class='common-sprite'] b"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(text(),'Çıkış')]"));
    }
}

