package com.komalbhoi.ex10_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium34_FileUpload_P1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement uploadFileInput=driver.findElement(By.id("fileToUpload"));
        String user_dir = System.getProperty("user.dir");
        String path = user_dir + "/src/test/java/com/komalbhoi/ex10_FileUpload/testdata.txt";
        //uploadFileInput.click();
        uploadFileInput.sendKeys(path);

        Thread.sleep(5000);

        driver.findElement(By.name("submit")).click();

        Thread.sleep(5000);

        driver.quit();
    }

}
