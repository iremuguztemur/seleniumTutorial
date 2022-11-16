package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger;

    public ProductPage() {
        methods = new Methods();
        logger = LogManager.getLogger(ProductPage.class);
    }

    public void scrollAndSelect() {

        methods.sendKeys(By.cssSelector("#search-input"), "edebiyat");
        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".button-search"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".pr-img-link"));
        methods.waitBySeconds(3);

        methods.scrollWithAction(By.cssSelector(".review-panel.review-panel__show-all"));
        methods.waitBySeconds(3);

        logger.info("Scroll Edildi");
        methods.waitBySeconds(3);

        methods.selectByText(By.cssSelector("select#review-sort-selection"), "Eklenme Tarihi (Eski - Yeni)");
        methods.waitBySeconds(5);

    }

    public void randomElement() {
        methods.sendKeys(By.cssSelector("#search-input"), "edebiyat");
        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);

        methods.randomElement(By.cssSelector(".pr-img-link")).click();
        methods.waitBySeconds(3);
    }

    public void attributeTest() {
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"), "title");
        System.out.println("alinan text: " + attribute);
        logger.info("alinan text: " + attribute);
        methods.waitBySeconds(3);
    }

    public void textControl() {
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("alinan text: " + text);
        logger.info("alinan text: " + text);
        methods.waitBySeconds(3);
    }

    public void valueControl(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("alinan text: "+ value);
        logger.info("alinan text: "+ value);
        Assert.assertEquals("beklenen deger ayni degil","testinium", value);
        methods.waitBySeconds(5);
    }
}