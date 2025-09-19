package com.komalbhoi.ex05_Selenium_Waits;

import com.komalbhoi.util.WaitHelpers;
import com.komalbhoi.util.commonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium24_MiniProject_3 extends commonToAll {

    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        new WaitHelpers().waitForVisibility(driver,5,"//span[@data-cy='closeModal']");

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

        closeBrowser(driver);
    }
}
