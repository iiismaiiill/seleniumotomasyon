package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.FavvoritePage;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.ProductPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class ProductTest extends BaseTest {

    // oyuncak ürünü  aratılır
    @Test
    public void searchTest() {
        ProductPage productPage = new ProductPage();
        productPage.search();
    }
    // 7 ince ürüne scroll  yapılır
    @Test
    public void scrollSeven(){
        ProductPage productPage = new ProductPage();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        productPage.search();
        productPage.scrollSeven();

    }

    // login ol
    //Oyuncak ara
    // 7.ürüne scroll yap
    // ürünleri favorile

    @Test
    public void  FavvoriteTest(){

        ProductPage productPage = new ProductPage();

        LoginPage loginPage = new LoginPage();
        loginPage.login();


        productPage.search();
        productPage.scrollSeven();


        productPage.Favvorite();




    }

    @Test
    public void favvoriteControlTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ProductPage productPage = new ProductPage();
        productPage.search();
        productPage.scrollSeven();


        // favori ekle
        productPage.Favvorite();
        // favori sayfasına git
        FavvoritePage favvoritePage = new FavvoritePage();
        favvoritePage.FavvoritePageClick();


        productPage.favvoriteControl();

    }

    // login ol
    // oyuncak ara
    // 7  ürüne scroll yap
    // anasayfaya dönüş testi yapılıyor
    @Test
    public void getAttribute(){


        ProductPage productPage = new ProductPage();
        productPage.attributeTest();

    }



}
