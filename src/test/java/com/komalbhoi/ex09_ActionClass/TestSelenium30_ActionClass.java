package com.komalbhoi.ex09_ActionClass;

import com.komalbhoi.util.commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium30_ActionClass extends commonToAll {

    @Test
    public void test_actions(){

        WebDriver driver = new ChromeDriver();
        String url ="https://www.spicejet.com/";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement from_input = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
        WebElement to_input = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div/input"));

        Actions actions = new Actions(driver);
        // move to element
        // click
        // sendkeys -BLR

        actions.moveToElement(from_input).click().sendKeys("BLR").build().perform();
        actions.moveToElement(to_input).click().sendKeys("DEL").build().perform();

        closeBrowser(driver);
    }
}
