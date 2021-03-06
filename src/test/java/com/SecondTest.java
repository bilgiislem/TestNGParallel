package com;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SecondTest extends TestBase{

    @Test
    public void GOOGLE4() throws Exception {
        System.out.println("Google4 Test  Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google4 Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google4 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void YANDEX() throws Exception {
        System.out.println("Yandex Test Start! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.yandex.com");
        System.out.println("Yandex Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Yandex");
        System.out.println("Yandex Test Ended! " + Thread.currentThread().getId());
    }
}