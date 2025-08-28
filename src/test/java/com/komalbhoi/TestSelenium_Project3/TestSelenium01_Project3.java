package com.komalbhoi.TestSelenium_Project3;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium01_Project3 {

    @Description("Mini project#3 - Start a trial button")
    @Test
    public void test_seleniumProject3(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //Step 2 - Click on the link
        WebElement trailLink = driver.findElement(By.linkText("Start a free trial"));
        trailLink.click();

        WebElement email_input = driver.findElement(By.name("email"));
        email_input.sendKeys("admin@admin.com");

        // click on checkbox
        WebElement checkbox_click = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox_click.click();

        // click on button
        WebElement button_submit = driver.findElement(By.xpath("//*[@id='page-free-trial-signup-form-step1']/div[3]/button"));
        button_submit.click();


//        WebElement error_message = driver.findElement(By.("//form[@id='page-free-trial-signup-form-step1']/div[@class='Mb(5px) invalid-input-group']/div"));
//        System.out.println(error_message.getText());

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        driver.quit();
    }
}
