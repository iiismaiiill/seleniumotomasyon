package com.kitapyurdu.methods;

import com.kitapyurdu.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver>wait;
    JavascriptExecutor jsdriver;

    public Methods(){

        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public List<WebElement> allElement(By by) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sendKeys(By by, String text) {

        findElement(by).sendKeys(text);
    }

    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }



    // input silme  methodu

    public void inputSil(By by){
        findElement(by).clear();
    }

    public Select getSelect(By by) {
        return new Select(findElement(by));
    }

    public void selectByTest(By by, String text) {

        getSelect(by).selectByVisibleText(text);

    }

    public String getAttribute(By by, String attributeName) {

        return findElement(by).getAttribute(attributeName);

    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public String getValue(By by){
        return jsdriver.executeScript("return arguments[0].value",findElement(by)).toString();
    }

    public void Actions(By by)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).perform();

    }

    public void randomSellectionBooks(By go, By click){

        Actions actions = new Actions(driver);
        Random random = new Random();
        int IndexElement= random.nextInt(allElement(go).size());
        actions.moveToElement(allElement(go).get(IndexElement)).perform();
        allElement(click).get(IndexElement).click();
    }

    public void addFavvorite4(By go, By click){

        Actions actions = new Actions(driver);
        Random random = new Random();
        for (int i = 8; i <12 ; i++) {
            actions.moveToElement(allElement(go).get(i)).perform();
            allElement(click).get(i).click();
        }
        // int IndexElement= random.nextInt(allElement(go).size());

    }

    public void selectBox(By by ,String text){
        Select bx = new Select(driver.findElement(by));
        bx.selectByVisibleText(text);
    }

    public void mouseGo (By by){
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }



}
