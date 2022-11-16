package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void ProductTest(){
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
    }

    @Test
    public void RandomTest(){
        ProductPage productPage = new ProductPage();
        productPage.randomElement();
    }

    @Test
    public void getAttribute(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public void getTextTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.textControl();
    }

    @Test
    public void valueTest(){
        ProductPage productPage= new ProductPage();
        productPage.valueControl();
    }

}
