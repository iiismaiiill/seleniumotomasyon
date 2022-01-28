package com.kitapyurdu.test;


import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.FavvoritePage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Test;

public class FavvoriteTest extends BaseTest {

    @Test
    public void FavvoritePageClickTest(){
        FavvoritePage favvoritePage = new FavvoritePage();
        favvoritePage.FavvoritePageClick();

    }

/*
    @Test
    public void uninstallFavvoriteTes(){

        FavvoritePage favvoritePage = new FavvoritePage();
        favvoritePage.uninstallFavvorite();
    }*/




}
