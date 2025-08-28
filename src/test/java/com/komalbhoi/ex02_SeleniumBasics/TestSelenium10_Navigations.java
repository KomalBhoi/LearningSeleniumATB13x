package com.komalbhoi.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium10_Navigations {

    @Description("Open the URL")
    @Test
    public void test_selenium01(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //Use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();
    }
}
