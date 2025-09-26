package com.komalbhoi.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.komalbhoi.util.commonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium26_Alerts extends commonToAll {

    @Test
    public void test_alerts(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement promptAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        promptAlert.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String name ="Komal";
        alert.sendKeys(name);
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered:"+name);

        closeBrowser(driver);
    }
}
