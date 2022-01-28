package com.kitapyurdu.odev.page;

import com.kitapyurdu.odev.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class HobbyPage {
    Methods methods;
    WebDriver driver;

public HobbyPage(){
    methods=new Methods();

}
public void SelectHobby(){
    methods.click(By.xpath("//ul[@class='js-ajaxCt js-bookCt']/li[3]"));
    methods.waitBySeconds(3);
    methods.click(By.xpath("//a[normalize-space()='Hobi']"));
    methods.waitBySeconds(3);
}
public void SelectRandomProduct(){
    methods.waitBySeconds(3);
    Random random = new Random();
    List<WebElement> allProducts = driver.findElements(By.xpath("//li[@class='mg-b-10']"));
    List<WebElement> allBaskets = driver.findElements(By.xpath("//a[@class='add-to-cart']"));
    int randomProduct= random.nextInt(allProducts.size());

    Actions builder = new Actions(driver);
    WebElement products = allProducts.get(randomProduct);
    WebElement basketLocation = allBaskets.get(randomProduct);
    methods.waitBySeconds(4);
    builder.moveToElement(products).build().perform();
    methods.waitBySeconds(4);
    basketLocation.click();
    methods.waitBySeconds(4);

}
public void RemoveToFav(){
    methods.waitBySeconds(3);
    methods.click(By.cssSelector("div[id='product-586888'] i[class='fa fa-heart-o']"));

}

}