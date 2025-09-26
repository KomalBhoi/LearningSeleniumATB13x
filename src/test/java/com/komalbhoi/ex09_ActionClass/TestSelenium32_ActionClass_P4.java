package com.komalbhoi.ex09_ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium32_ActionClass_P4 {

    @Test
    public void test_actionP4(){

        WebDriver driver = new ChromeDriver();
        String url ="https://thetestingacademy.com/";
        driver.get(url);
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        driver.quit();
    }
}
