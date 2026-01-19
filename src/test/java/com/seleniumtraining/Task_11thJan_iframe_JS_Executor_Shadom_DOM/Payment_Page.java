package com.seleniumtraining.Task_11thJan_iframe_JS_Executor_Shadom_DOM;

import com.seleniumtraining.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Payment_Page {

    @Test
    public void Paymentpage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        WaitHelpers.waitJVM(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//input[@id='cardName']"))).build().perform();
        driver.findElement(By.xpath("//input[@id='cardName']")).sendKeys("john doe");

        actions.moveToElement(driver.findElement(By.xpath("//input[@id='cardNumber']"))).build().perform();
        driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("1234567812345678");

        actions.moveToElement(driver.findElement(By.xpath("//input[@id='expiry']"))).build().perform();
        driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0329");

        actions.moveToElement(driver.findElement(By.xpath("//input[@id='cvv']"))).build().perform();
        driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");

        actions.moveToElement(driver.findElement(By.xpath("//button[@type='submit']"))).build().perform();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
