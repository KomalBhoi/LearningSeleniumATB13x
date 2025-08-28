package com.komalbhoi.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium03 {

    public static void main(String[] args) {

        // 1. Do want to run on  Chrome or Edge? (1-2%)
        ChromeDriver driver = new ChromeDriver();

        // 2. Do you want to run on Chrome then change to Edge ? (96%)
        WebDriver driver1 = new ChromeDriver();
        // driver1 = new EdgeDriver();

        // 3. Do you want to run on multiple browsers, aws machine? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 sessions)
    }
}
