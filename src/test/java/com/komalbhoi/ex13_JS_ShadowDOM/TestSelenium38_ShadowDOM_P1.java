package com.komalbhoi.ex13_JS_ShadowDOM;

import com.komalbhoi.util.commonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.komalbhoi.util.WaitHelpers.waitJVM;

public class TestSelenium38_ShadowDOM_P1 extends commonToAll {

    @Test
    public void test_shadowDOM_P1(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        waitJVM(3000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        //WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputboxPizza.sendKeys("farmhouse");

        closeBrowser(driver);
    }

}
