package com.komalbhoi.ex04_Selenium_XPath;

import com.komalbhoi.util.commonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TestSelenium21_MiniProject_1<List> extends commonToAll {

    @Owner("Komal")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test
    public void test_katalon_login(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointment_Btn_xpath = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        makeAppointment_Btn_xpath.click();

//        WebElement userNameInput_xpath = driver.findElement(By.xpath("//input[@id='txt-username']"));
//        userNameInput_xpath.sendKeys("John Doe");
//
//        WebElement passwordInput_xpath =driver.findElement(By.xpath("//input[@id='txt-password']"));
//        passwordInput_xpath.sendKeys("ThisIsNotAPassword");

        //List username_input_box_xpath_placeholder = (List) driver.findElements(By.xpath("//input[@placeholder='Username']"));
        //username_input_box_xpath_placeholder.getClass(1).sendKeys("John Doe");

        java.util.List<WebElement> username_input_box_xpath_placeholder=driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box_xpath_placeholder.get(1).sendKeys("John Doe");

        java.util.List<WebElement> passwordInput_xpath = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        passwordInput_xpath.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_btn.click();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        //Verify page redirect to the next page or not
        WebElement h2= driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        Assert.assertEquals(h2.getText(),"Make Appointment");
        Assert.assertTrue(h2.isDisplayed());

        System.out.println("Program End");
        closeBrowser(driver);
    }
}
