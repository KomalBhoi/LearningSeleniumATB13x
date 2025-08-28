package com.komalbhoi.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium12_Close_Vs_Quit {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null
        driver.close();

        // quit - It will close all the tabs. - session id == null
        driver.quit();
    }
}
