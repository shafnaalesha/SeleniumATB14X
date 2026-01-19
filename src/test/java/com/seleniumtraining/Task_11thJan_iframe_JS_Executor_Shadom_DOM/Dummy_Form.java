package com.seleniumtraining.Task_11thJan_iframe_JS_Executor_Shadom_DOM;

import com.seleniumtraining.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dummy_Form {
    @Test
    public void test_fill_details()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
//Dummy Form
        WaitHelpers.waitJVM(3000);

        WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
        username.sendKeys("shafnaalesha@gmail.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("alesha@2015");

        WebElement company_name = driver.findElement(By.name("company"));
        company_name.sendKeys("Testing academy");

        WebElement ph_no = driver.findElement(By.name("mobile number"));
        ph_no.sendKeys("123456789");

        WebElement country_name = driver.findElement(By.xpath("//label[text()='Country']/input"));
        country_name.sendKeys("India");

        WebElement crushname = driver.findElement(By.id("inp_val"));
        crushname.sendKeys("Ajeesh");

        WebElement button = driver.findElement(By.xpath("//button[@value='Submit']"));
        button.click();




        driver.quit();

    }
}
