package com.seleniumtraining.Assignment;

import com.seleniumtraining.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_MiniProject2 extends CommonToAll {
@Description("Verify Start a free trial , error msg is displayed")
@Owner("Shafna")
@Severity(SeverityLevel.BLOCKER)
    @Test

    public void Start_free_trial() {
    //Step 1: Open browser, pass url
    WebDriver driver =  new ChromeDriver();
    openBrowser(driver,"https://app.vwo.com");
//Step2: Click 'start trial'
    //<a
    // href="https://vwo.com/free-trial/?utm_medium=website&amp;
    // utm_source=login-page&amp;
    // utm_campaign=mof_eg_loginpage"
    // class="text-link Td(n) Whs(nw)"
    // data-qa="bericafeqo"
    // vwo-html-translate="login:startFreeTrial">
    // Start a free trial
    // </a>
    WebElement Start_free_trial = driver.findElement(By.linkText("Start a free trial"));
    Start_free_trial.click();
    Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

    //Step3: add an invalid email and verify,
    //<input
    // class="W(100%) Py(14px) input-text"
    // placeholder="name@yourcompany.com"
    // type="email"
    // id="page-v1-step1-email"
    // name="email"
    // data-qa="page-su-step1-v1-email"
    // required="">

    WebElement Email = driver.findElement(By.id("page-v1-step1-email"));
    Email.sendKeys("abc");

    //Step4:check checkbox
    //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
    // type="checkbox"
    // name="gdpr_consent_checkbox"
    // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
    // value="true"
    // data-qa="page-free-trial-step1-gdpr-consent-checkbox">

    WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
    checkbox.click();

    //Step5:
    //Step4 - Wait some time

    customWait(5000);

    //Step6:submit 'create a Free trial'
    //<button
    // type="submit" disabled=""
    // class="button button--disabled-primary W(100%) btn-modal-form-submit"
    // data-qa="page-su-submit">Create a Free Trial Account
    // </button>

    WebElement create = driver.findElement(By.tagName("button"));
    create.click();

    //Step7:verify error message text
    //<div
    // class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0)
    // invalid-input+Op(1)
    // invalid-reason">The email address you entered is incorrect.
    // </div>
WebElement error_message = driver.findElement(By.className("invalid-reason"));
    //System.out.println(error_Message.getText());
    Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");
    closeBrowser(driver);
}
}
