package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);
    public ProductPage(){
        methods = new Methods();
    }

    public void search(){

        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.click(By.cssSelector(".button-search"));
    }

    // 7.ürün scroll yapma..
    public void scrollSeven(){
        methods.scrollWithAction(By.cssSelector("div:nth-of-type(7) > .grid_7.omega"));
        methods.waitBySeconds(3);
    }



    public void Favvorite(){


        methods.addFavvorite4(By.cssSelector(".product-cr"),By.cssSelector(".add-to-favorites"));
        methods.waitBySeconds(3);

    }



    public void favvoriteControl(){



        //kontrol
        String text = methods.getText(By.cssSelector(".favorite-tag > span"));
        System.out.println("Alınan text :" + text);
        logger.info("Alınan text : "+text);
        Assert.assertEquals("4", text);
        logger.info("Favoriye ekleme başarılı  bir şekilde yapılmıştır  :) ");
        methods.waitBySeconds(3);

    }

    // log yap
    // logoyu bul ve click  at ana sayfaya dön

    public void attributeTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.click(By.cssSelector(".button-search"));
        methods.waitBySeconds(3);
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".logo-text>a>img"));
        methods.waitBySeconds(3);
        System.out.println("Alınan text :"+ attribute);
        logger.info("Alınan text :"+ attribute);
        methods.waitBySeconds(3);

    }




}
