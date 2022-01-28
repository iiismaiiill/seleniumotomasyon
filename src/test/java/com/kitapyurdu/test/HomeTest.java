package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {

    // Base test den extend ettik !!!
    // home page gittik--> home page class ında tanımladığımız xpath'e  göre sayfaya gitti
    @Test
    public void homeTest(){
        HomePage homePage = new HomePage();

        homePage.home();
    }
}
