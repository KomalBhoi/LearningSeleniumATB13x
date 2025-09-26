package com.komalbhoi.ex08_SVG_Elements;

import com.komalbhoi.util.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium28_SVG {

    @Test
    public void test_Flipkart_Search_Icon(){

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        String url ="https://www.flipkart.com/search";
        driver.get(url);

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("macmini");

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(0).click();

        WaitHelpers waitHelpers = new WaitHelpers();
        waitHelpers.waitForVisibility(driver,10,"//div[contains(@data-id,'CPU')]/div/a[2]");

        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
        for(WebElement title:titlesResults){
            System.out.println(title.getText());
        }

        // until Next button is visible, for loop
        WebElement next_button = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
        while(next_button.isDisplayed()){

            WebElement next_button_page2=driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_button_page2.click();

            waitHelpers.waitForVisibility(driver, 30,"//div[contains(@data-id,'CPU')]/div/a[2]");

            try {
                List<WebElement> titleResults2 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
                //driver.navigate().refresh();

                for (WebElement title : titleResults2) {
                    if (title.getText() != null) {
                        System.out.println(title.getText());
                    }
                }
            }catch(StaleElementReferenceException e){
                List<WebElement> titleResults2 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
                for (WebElement title : titleResults2) {
                    if (title.getText() != null) {
                        System.out.println(title.getText());
                    }
                }
            }
        }

        driver.quit();
    }
}
