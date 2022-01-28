package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class FavvoritePage {

    Methods methods;

    public FavvoritePage() {
        methods = new Methods();

    }

    public void FavvoritePageClick() {


        // listelerim butonu  click atılır
        methods.Actions(By.cssSelector(".menu.my-list.top > ul  .common-sprite"));
        methods.waitBySeconds(3);
        //favorilerim click
        methods.click(By.cssSelector(".menu.my-list.top > ul  div > ul > li:nth-of-type(1) > a"));
        methods.waitBySeconds(3);

        // methods.selectBox(By.cssSelector(".menu.my-list.top > ul  .common-sprite"),"Favorilerim");


    }


    public void uninstallFavvorite() {


        methods.Actions(By.cssSelector(".menu.my-list.top > ul  .common-sprite"));
        methods.waitBySeconds(3);


        // favorilerim click
        methods.click(By.cssSelector(".menu.my-list.top > ul  div > ul > li:nth-of-type(1) > a"));
        methods.waitBySeconds(3);


        // silme işlemi

        methods.click(By.cssSelector("a:nth-of-type(2) > .fa.fa-heart-o"));

        methods.waitBySeconds(3);

    }
}
