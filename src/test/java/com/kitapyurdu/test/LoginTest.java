package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    // login testi
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }

    // çıkış testi
    @Test
    public void LogOutTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.LogOut();
    }


}
