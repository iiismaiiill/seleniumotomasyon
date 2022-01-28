package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.PointCatalogPage;
import org.junit.Test;
import sun.rmi.runtime.Log;

public class PointCatalogTest extends BaseTest {

    //puan kataloguna girilir
    @Test
    public void PointCatalogTestClick() {
        //puan katalog sayfasına gidilir
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.PointCatalogPageClick();

    }

    //türk kilasikleri şeçilir
    @Test
    public void TurkishCatalogClick() {

        // ilk  önce puan katalog sayfasına gidilir

        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.PointCatalogPageClick();

        // TurkishCatalog clicklenir.

        pointCatalogPage.TurkishCatalogClick();

    }

    //açılan sayfada filtreleme yüksek oylama yapılır
    @Test
    public void turkishClasickFilterTest() {

        // puan kaalog sayfasına gir...
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.PointCatalogPageClick();
        // turk klasikleri ne  tıkla
        pointCatalogPage.TurkishCatalogClick();
        //filtrele
        pointCatalogPage.turkishClasickFilter();

    }

    // tüm kitaplar hobi tıklama
    @Test
    public void clickAllBooksAndHobiTest() {
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.clickAllBooksAndHobi();


    }

    // sayfadan random ürün ekleme  testi.
    @Test
    public void hobiRadomCatsTest(){
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.hobiRadomCats();

    }

    // test sepetteki ürünü 1 arttır

    @Test
    public void catsPlustOneTest(){


        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.hobiRadomCats();

        // sepette kitap olması için önceden kullanıdığım randomu ekliyorum

        pointCatalogPage.catsPlustOne();

    }

    @Test
    public void catsBuyControlAndNewAdressTest(){
        // login ol
        LoginPage loginPage = new LoginPage();
        loginPage.login();


        // random ürün ekle
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.hobiRadomCats();

        // sepette kitap olması için önceden kullanıdığım randomu ekliyorum


        // adres ekleme ve devam etme
        pointCatalogPage.catsBuyControlAndNewAdress();


    }

    @Test
    public void PayPageTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();


        // random ürün ekle
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.hobiRadomCats();

        // sepette kitap olması için önceden kullanıdığım randomu ekliyorum


        // adres ekleme ve devam etme
        pointCatalogPage.catsBuyControlAndNewAdress();



       // ödeme işlemleri
        pointCatalogPage.PayPage();


    }




}
