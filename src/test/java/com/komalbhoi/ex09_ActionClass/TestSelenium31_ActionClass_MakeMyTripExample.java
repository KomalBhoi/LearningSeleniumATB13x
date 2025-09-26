package com.komalbhoi.ex09_ActionClass;

import com.komalbhoi.util.WaitHelpers;
import com.komalbhoi.util.commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium31_ActionClass_MakeMyTripExample extends commonToAll {

    @Test
    public void test_actionP3(){

        WebDriver driver = new ChromeDriver();
        String url ="https://www.makemytrip.com/";
        driver.get(url);
        driver.manage().window().maximize();

        new WaitHelpers().waitForVisibility(driver, 5,"//span[@data-cy='closeModal']");
        WebElement modal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        modal.click();

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy='toCity']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();
        new WaitHelpers().waitJVM(3000);

        List<WebElement>  list_autoComplete = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

        try{
            for(WebElement e:list_autoComplete){
                if(e.getText().contains("Mumbai")){
                    e.click();
                }
            }
        }catch (Exception e){
            System.out.println("Okay");
        }

        closeBrowser(driver);
    }
}
