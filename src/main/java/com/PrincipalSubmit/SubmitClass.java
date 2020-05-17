package com.PrincipalSubmit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;

public class SubmitClass {
    WebDriver driver;

    @Test
    @Parameters({"url"})
    public void clickSubmit(String url) throws Exception{

        System.setProperty("webdriver.chrome.driver","src\\main\\java\\Resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        //driver = new RemoteWebDriver(new URL("http://52.90.7.52:4444/wd/hub"), options);
        driver = new ChromeDriver(options);
        driver.get(url);
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button")));
        System.out.println("Navigated to url");

        driver.findElement(By.xpath("//button")).click();
        System.out.println("Clicked the button");

        driver.close();
        System.out.println("Success B\"H");
    }


}
