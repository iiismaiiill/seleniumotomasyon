package com.kitapyurdu.page;


import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.Random;

public class PointCatalogPage {

    Methods methods;

    public PointCatalogPage() {

        methods = new Methods();

    }

    public void PointCatalogPageClick() {

        // puan kataloğu pointCatalog click
        methods.click(By.cssSelector(".lvl1catalog .common-sprite"));
        methods.waitBySeconds(3);


    }

    public void TurkishCatalogClick() {


        methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
    }


    // filtreleme

    public void turkishClasickFilter() {

        methods.click(By.cssSelector(".sort > select"));
        methods.waitBySeconds(3);
        methods.selectByTest(By.cssSelector(".sort > select"), "Yüksek Oylama");
        methods.waitBySeconds(3);

    }


    public void clickAllBooksAndHobi() {

        // tüm kitapları button click
        methods.click(By.cssSelector(".js-bookCt li:nth-of-type(3) .mn-strong"));
        methods.waitBySeconds(3);
        // hobi button click

        methods.click(By.cssSelector("li:nth-of-type(14) .icon-angleRight"));
        methods.waitBySeconds(3);


    }

    public void hobiRadomCats() {
        // tüm kitapları button click
        methods.click(By.cssSelector(".js-ajaxCt.js-bookCt > li:nth-of-type(3) > .common-sprite.mn-strong"));
        methods.waitBySeconds(3);
        // hobi button click

        methods.click(By.cssSelector("li:nth-of-type(14) .icon-angleRight"));
        methods.waitBySeconds(3);

        // random
        methods.randomSellectionBooks(By.cssSelector(".product-cr"), By.cssSelector(".add-to-cart"));
        methods.waitBySeconds(5);
    }

    // sepetteki ürünü bir arttırma


    public void catsPlustOne() {



        methods.click(By.cssSelector("div#cart"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("/html//a[@id='js-cart']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("[action] [type='text']"));


        // sepetteki değeri silme
        methods.inputSil(By.cssSelector("[action] [type='text']"));
        // değeri 2 gönder
        methods.findElement(By.cssSelector("[action] [type='text']")).sendKeys("2");

        methods.waitBySeconds(3);
        // güncelleme
        methods.click(By.cssSelector("[title='Güncelle']"));
        methods.waitBySeconds(3);

    }




    // adress bilgieri eklenir

    public void FirstAddresAdd(){

        // yeni bir adres ekle tıklanır
        methods.click(By.cssSelector("div#shipping-tabs > a:nth-of-type(2)"));
        //
        //isim
        methods.sendKeys(By.cssSelector("input#address-firstname-companyname"),"İsmail");
        methods.waitBySeconds(3);
        //soyisim
        methods.sendKeys(By.cssSelector("input#address-lastname-title"),"Başarslan");
        methods.waitBySeconds(3);
        //ülke
        methods.selectBox(By.cssSelector("select#address-country-id"),"Türkiye");
        methods.waitBySeconds(3);
        //şehir
        methods.selectBox(By.cssSelector("select#address-zone-id"),"İstanbul");
        methods.waitBySeconds(3);
        //ilçe
        methods.selectBox(By.cssSelector("select#address-county-id"),"PENDİK");
        methods.waitBySeconds(3);
        //mahalle
        methods.sendKeys(By.cssSelector("input#district"),"Çamçeşme");
        methods.waitBySeconds(3);
        //açık adres
        methods.sendKeys(By.cssSelector("textarea#address-address-text"),"Aydınlı cad. No:71A daire :15");
        methods.waitBySeconds(3);
        //posta kodu
        methods.sendKeys(By.cssSelector("input#address-postcode"),"34899");
        methods.waitBySeconds(3);
        //sabit telefon
        methods.sendKeys(By.cssSelector(".form tr:nth-child(11) [type]"),"5070254486");
        methods.waitBySeconds(3);
        //telefon
        methods.sendKeys(By.cssSelector(".form tr:nth-child(12) [type]"),"5070254486");
        methods.waitBySeconds(3);
        //tc kimlik
        methods.sendKeys(By.cssSelector("input#address-tax-id"),"54001481238");
        methods.waitBySeconds(3);
        // devam et
        methods.click(By.xpath("/html//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(3);

    }


    public void catsBuyControlAndNewAdress() {



        methods.click(By.cssSelector("div#cart"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("/html//a[@id='js-cart']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("[action] [type='text']"));


        // sepetteki değeri silme
        methods.inputSil(By.cssSelector("[action] [type='text']"));
        // değeri 2 gönder
        methods.findElement(By.cssSelector("[action] [type='text']")).sendKeys("2");

        methods.waitBySeconds(3);
        // güncelleme
        methods.click(By.cssSelector("[title='Güncelle']"));
        methods.waitBySeconds(3);

        // sepetteki ürünü satın al

        methods.click(By.cssSelector(".right > .button.red"));

        // satın alma ve adress kayıt
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.FirstAddresAdd();

        //karogo butonu
        methods.click(By.cssSelector("button#button-checkout-continue"));




    }

    // ödeme bilgiler

    public void PayPage(){




       // methods.click(By.cssSelector("button#button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit-card-owner"),"Mahmut Tuncer");
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("input[name='credit_card_number_1']"),"4111");
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("input[name='credit_card_number_2']"),"1111");
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("input[name='credit_card_number_3']"),"1111");
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("input[name='credit_card_number_3']"),"1129");
        methods.waitBySeconds(3);
        methods.selectBox(By.cssSelector("select#credit-card-expire-date-month"),"01");
        methods.waitBySeconds(3);
        methods.selectBox(By.cssSelector("select#credit-card-expire-date-year"),"2026");
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("input#credit-card-security-code"),"345");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("button#button-checkout-continue"));
        methods.waitBySeconds(5);







    }


}
