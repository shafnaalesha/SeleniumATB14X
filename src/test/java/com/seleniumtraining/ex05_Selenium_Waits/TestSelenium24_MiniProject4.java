package com.seleniumtraining.ex05_Selenium_Waits;

import com.seleniumtraining.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium24_MiniProject4 extends CommonToAll {
    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        waitForVisibility(driver,5, "//span[@data-cy=\"closeModal\"]");

        WebElement closePopup = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closePopup.click();

        closeBrowser(driver);
    }
}
