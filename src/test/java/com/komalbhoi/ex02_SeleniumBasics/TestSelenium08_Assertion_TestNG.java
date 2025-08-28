package com.komalbhoi.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium08_Assertion_TestNG {

   @Description("Verify that the title is visible.")
    @Test
    public void test_selenium_assertion(){
       WebDriver driver = new ChromeDriver();
       driver.get("https://google.com");

       // TestNG Assertion
       Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/?zx=1756380052274&no_sw_cr=1");

       // AssertJ
       assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");

       // Rest Assured? (ValidatableResponse)
       driver.quit();
   }
}