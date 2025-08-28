package com.komalbhoi.ex01_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_code(){
        Assert.assertEquals("Komal","Komal");
    }

    @Test
    public void test_OpenTheTestingAcademy(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://thetestingacademy.com");
    }
}
