package com.seleniumtraining.ex12_Windows;

import com.seleniumtraining.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_Windows_Part1 {
    @Test
    public void test_windows() {
        WebDriver driver = new ChromeDriver();
        String URL = ("https://the-internet.herokuapp.com/windows");
        driver.get(URL);
        driver.manage().window().maximize();

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        //F284689E7555DC42909B7250785A70BF

        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();

        Set<String> windows_handles_ids = driver.getWindowHandles();
        //2-16 digit ids

        for(String window: windows_handles_ids) {
            driver.switchTo().window(window);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Test Passed!!");
            }


        }
        //In the end, I am switching back to my parents.
driver.switchTo().window(parent_id);


        new WaitHelpers().waitJVM(5000);
        driver.quit();
    }
}
