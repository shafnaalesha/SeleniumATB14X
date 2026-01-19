package com.seleniumtraining.Task_11thJan_iframe_JS_Executor_Shadom_DOM;

import com.seleniumtraining.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Shadow_Dom {
    @Test
    public void test_shadow_DOM(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement username = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('input#kils')");
        username.sendKeys("shafnaalesha@gmail.com");

        WebElement input_pizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('input#pizza')");
        input_pizza.sendKeys("farmhouse");
/*
        WaitHelpers.waitJVM(2000);
        WebElement concept_test = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#concepts')");
        //workaround inside closed shadowDOM
        WaitHelpers.waitJVM(2000);
        concept_test.click();

        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("DevTools cltr+f gives").perform();

        WaitHelpers.waitJVM(3000);

        action.sendKeys(Keys.TAB).perform();

        //for the url to click;
    WaitHelpers.waitJVM(3000);
 action.sendKeys(Keys.ENTER).perform();

        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("alesha@2015").perform();*/

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys("Test Concept").build().perform();

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys("AA@password").build().perform();


    }
}
