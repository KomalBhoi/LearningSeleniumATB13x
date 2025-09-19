package com.komalbhoi.ex03_Selenium_Locators;

import com.komalbhoi.util.commonToAll;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_MiniProject extends commonToAll {

    @Owner("Komal")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_freeTrial_Error_Verify(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");

        WebElement a_tag_partial_match = findElementByPartialText(driver,"trial");
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkBox_policy = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkBox_policy.click();

        WebElement btn_submit= driver.findElement(By.xpath("//button[@type ='submit']"));
        btn_submit.click();

        closeBrowser(driver);
    }
}
