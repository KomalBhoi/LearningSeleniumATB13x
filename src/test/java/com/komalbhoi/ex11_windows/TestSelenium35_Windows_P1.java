package com.komalbhoi.ex11_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium35_Windows_P1 {

    @Test
    public void test_windows(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);

        WebElement link_parentelement = driver.findElement(By.xpath("//a[text()='Click Here']"));
        link_parentelement.click();

        // 2 Windows
        Set<String> windows_handles_ids = driver.getWindowHandles();
        System.out.println(windows_handles_ids);

        // How do I switch to the child window and
        // verify that there is a text with the name of new window?

        for(String window:windows_handles_ids){
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed!");
            }
        }

        driver.quit();
    }
}
