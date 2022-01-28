package com.kitapyurdu.odev.page;

import com.kitapyurdu.odev.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    Methods methods;

    public CartPage() {
        methods = new Methods();
    }

    public void goToCart(){
        methods.click(By.id("cart-items"));
        methods.click(By.id("js-cart"));
    }
    public void increaseItem(){
        methods.findElement(By.cssSelector("input[name='quantity']")).clear();
        methods.sendKeys(By.cssSelector("input[name='quantity']"),"5");
    }

    public void buyItems(){
        methods.click(By.cssSelector("a[class='button red']"));
    }

    public void addressAndPaymentInfo(){
        methods.sendKeys(By.id("address-firstname-companyname"),"Onder");
        methods.sendKeys(By.id("address-lastname-title"),"Yerim");

        WebElement city=methods.findElement(By.id("address-zone-id"));
        Select dropdownCity=new Select(city);
        dropdownCity.selectByValue("3354");
        methods.waitBySeconds(2);

        WebElement town=methods.findElement(By.id("address-county-id"));
        Select dropdownTown=new Select(town);
        dropdownTown.selectByValue("444");

        methods.sendKeys(By.id("district"),"Kartaltepe");
        methods.sendKeys(By.id("address-address-text"),"Incirli 11");
        methods.sendKeys(By.id("address-telephone"),"2125838383");
        methods.sendKeys(By.id("address-mobile-telephone"),"5385838383");
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));

        methods.sendKeys(By.id("credit-card-owner"),"Onder");
        methods.sendKeys(By.id("credit_card_number_1"),"4263982640269299");

        WebElement creditCardMonth= methods.findElement(By.id("credit-card-expire-date-month"));
        Select dropdownMonth=new Select(creditCardMonth);
        dropdownMonth.selectByValue("02");

        WebElement creditCardYear= methods.findElement(By.id("credit-card-expire-date-year"));
        Select dropdownYear=new Select(creditCardYear);
        dropdownYear.selectByValue("2023");

        methods.sendKeys(By.id("credit-card-security-code"),"123");
        methods.click(By.id("button-checkout-continue"));
        methods.click(By.cssSelector("input[type='checkbox']"));
        methods.click(By.cssSelector("input[type='submit']"));
        methods.waitBySeconds(7);
    }
    public void isPaymentSuccess(){
        String paymentText= methods.getText(By.cssSelector("div[class='warning']"));
        methods.isElementVisible(By.cssSelector("div[class='warning']"));
        System.out.println("Odeme Bilgisi :" +paymentText);
    }
}