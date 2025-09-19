package com.komalbhoi.ex04_Selenium_XPath;

import com.komalbhoi.util.commonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium20_MiniProject extends commonToAll {

    @Owner("Komal")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userNm = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        //WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        //WebElement btn_login = driver.findElement(By.xpath("//button[@type='submit']"));

        userNm.sendKeys("admin");
        //password.sendKeys("admin123");
        //btn_login.click();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        closeBrowser(driver);
    }
}
