package com.testinium.pages;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.sql.Driver;

public class LoginPage {

    Methods methods;

    public LoginPage() {
        methods = new Methods();
    }

    public void login(){
        methods.findElement(By.xpath("//div[@class=\"menu-top-button login\"]")).click();
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-email"),"nese.aydin@testinium.com");
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-password"),"1q2w3e4r5t");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".ky-login-btn"));
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".platinum")));
        methods.waitBySeconds(3);
    }
}
