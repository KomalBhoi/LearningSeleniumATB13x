package com.komalbhoi.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium23_MiniProject_2 {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Komal")
    @Test
    public void test_vwo_login_invalid_login(){

        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

        WebElement emailInput_xpath = driver.findElement(By.xpath("//input[@id='login-username']"));
        emailInput_xpath.sendKeys("admin@admin.com");

        WebElement pwdInput_xpath = driver.findElement(By.xpath("//input[@id='login-password']"));
        pwdInput_xpath.sendKeys("12345");

        WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
        btnSubmit.click();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        // Step 6, we have added the TestNG assertion to verify.
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }


}
