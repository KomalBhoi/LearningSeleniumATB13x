package com.komalbhoi.ex02_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_NoHTTP {

    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        //driver.get("bing.com");
        driver.get("https://bing.com");

        driver.quit();
    }
}
