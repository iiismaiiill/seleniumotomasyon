package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;


    public LoginPage(){

        methods = new Methods();

    }
    // login  consturucter tanımlanıyor.
    //login işlemleri yaılıyor aralarda görmek için bekletiliyor...
    public void login(){
        // ana sayfadan login butonuna tıklanır  login açılır...
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(3);
        // logine e mail  adresi  girilir...
        methods.sendKeys(By.id("login-email"),"ismail.basarslan@testinium.com");
        methods.waitBySeconds(3);
        // password girilir...
        methods.sendKeys(By.id("login-password"),"1q2w3e4r5t");
        methods.waitBySeconds(3);
        //Giriş Yap butonuna tıklanır(click methodu !!!)...
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);


    }

    public void LogOut(){
        methods.mouseGo(By.cssSelector(".common-sprite > b"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".login ul li:nth-of-type(4)"));
        methods.waitBySeconds(4);
    }

}
