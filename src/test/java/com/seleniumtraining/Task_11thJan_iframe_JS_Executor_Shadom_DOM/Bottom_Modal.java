package com.seleniumtraining.Task_11thJan_iframe_JS_Executor_Shadom_DOM;

import com.seleniumtraining.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Bottom_Modal {
    @Test
    public void bottomModal() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
//Dummy Form
        WaitHelpers.waitJVM(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//button[@id='myBtn']"))).build().perform();
        driver.findElement(By.xpath("//button[@id='myBtn']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-header']/span")));

        driver.findElement(By.xpath("//div[@class='modal-header']/span")).click();
    }
}
