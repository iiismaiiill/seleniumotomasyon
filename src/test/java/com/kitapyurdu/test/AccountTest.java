package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.AccountPage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Test;

public class AccountTest extends BaseTest {

    // account sayfasında login kontrolu yapilir...
    // kullanıcının giriş  yapmasi sağlanir ..
    @Test
    public void loginControlTest(){
        AccountPage accountPage = new AccountPage();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        accountPage.loginControlTest();
    }


}
