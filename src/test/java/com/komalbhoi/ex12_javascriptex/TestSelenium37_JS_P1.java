package com.komalbhoi.ex12_javascriptex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium37_JS_P1 {

    @Test
    public void test_js() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.location= 'https://www.google.com' ");
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("window.scrollBy(0,1000);");
        js.executeScript("window.scrollBy(0,1000);");

        //div_to_scroll.sendKeys("Komal");

        Thread.sleep(3000);
        String url = js.executeScript("return document.URL").toString();
        String title = js.executeScript("return document.title").toString();

        System.out.println(url);
        System.out.println(title);

        Thread.sleep(3000);

        driver.quit();
    }
}
