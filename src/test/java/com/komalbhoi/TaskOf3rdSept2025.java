package com.komalbhoi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TaskOf3rdSept2025 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        driver.findElement(By.name("firstname")).sendKeys("Komal");
        driver.findElement(By.name("lastname")).sendKeys("Bhoi");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("profession-1")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("submit"))));
        driver.findElement(By.id("submit")).click();

        driver.quit();
    }
}
