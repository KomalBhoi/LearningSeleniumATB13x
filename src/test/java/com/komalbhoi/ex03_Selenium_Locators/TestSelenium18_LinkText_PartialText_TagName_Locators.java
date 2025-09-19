package com.komalbhoi.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium18_LinkText_PartialText_TagName_Locators {


        @Description("Verify VWO")
        @Test
        public void test_login_vwo(){

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.vwo.com");

            WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
            a_tag_partial_match.click();

            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }

            driver.quit();
        }

}
