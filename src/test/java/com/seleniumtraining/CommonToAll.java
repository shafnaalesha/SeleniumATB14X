package com.seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonToAll {
    // Common functionality for all tests
    public void openBrowser(WebDriver driver, String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
public void closeBrowser(WebDriver driver) {
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.quit();
}
public void customWait(int time){
        try {
            Thread.sleep(time);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);

        }
}
}
