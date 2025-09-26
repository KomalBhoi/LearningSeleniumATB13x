package com.komalbhoi.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.komalbhoi.util.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium27_Modal {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        new WaitHelpers().waitForVisibility(driver,5000,"//span[@data-cy='closeModal']");
        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

        driver.quit();
    }
}
