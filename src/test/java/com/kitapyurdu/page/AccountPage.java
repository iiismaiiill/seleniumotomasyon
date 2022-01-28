package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;


public class AccountPage {
    Methods methods;
    Logger logger = LogManager.getLogger(AccountPage.class);

    public AccountPage(){
        methods= new Methods();
    }

    public void loginControlTest(){
        String text = methods.getText(By.cssSelector(".login .common-sprite"));
        System.out.println("Alınan text :" + text);
        logger.info("Alınan text : "+text);
        logger.info("Başarılı şekilde login yapıldı.  :) ");
        methods.waitBySeconds(3);

    }

}
