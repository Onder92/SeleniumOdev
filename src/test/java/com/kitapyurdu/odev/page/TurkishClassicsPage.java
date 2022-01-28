package com.kitapyurdu.odev.page;

import com.kitapyurdu.odev.methods.Methods;
import org.openqa.selenium.By;

public class TurkishClassicsPage {
    Methods methods;
    public TurkishClassicsPage(){
        methods=new Methods();
    }
    public void SelectTurkishClassics(){
    methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));
    methods.click(By.xpath("//div[@class='sort']//select[@onchange='location = this.value;']"));
    methods.selectByText(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select"),"Yüksek Oylama");

    }

}
