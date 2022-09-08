package com.pacificgeotech.framework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LocateElement {
    public static class Xpath {

        public static void Click(String xPath)  {

            WebDriver driver = WebDriverManager.getDriver();
            WebDriverWait driverWait = WebDriverManager.getDriverWait();
            WebElement element;

            WebDriverManager.Sleep(1000);

            try {
                driver.findElements(By.xpath(xPath));
                element = driverWait
                        .until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
            } catch (Throwable e) {
                element = null;
            }
            if (element != null) {
                element = driver.findElement(By.xpath(xPath));
                element.click();
            }
            if (element == null) {
                element = driver.findElement(By.xpath(xPath));
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", element);
            }

            WebDriverManager.Sleep(1000);
        }

        public static void Clear(String xPath) {

            WebDriver driver = WebDriverManager.getDriver();
            WebDriverWait driverWait = WebDriverManager.getDriverWait();
            WebElement element;

            try {
                element = driverWait
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
            } catch (Throwable e) {
                element = null;
            }
            if (element != null) {
                element = driver.findElement(By.xpath(xPath));
                element.clear();
            }
        }

        public static void Enter(String xPath, String text) {

            WebDriver driver = WebDriverManager.getDriver();
            WebDriverWait driverWait = WebDriverManager.getDriverWait();
            WebElement element;

            try {
                element = driverWait
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
            } catch (Throwable e) {
                element = null;
            }
            if (element != null) {
                //LocateElement.Xpath.Click(xPath);
                //LocateElement.Xpath.Enter(xPath, text);
                WebDriverManager.Sleep(1000);
                element = driver.findElement(By.xpath(xPath));
                element.sendKeys(text);
            }

        }

        public static int Count(String xpath) {
            WebDriver driver = WebDriverManager.getDriver();
            WebDriverManager.Sleep(1000);

            return driver.findElements(By.xpath(xpath)).size();

        }

        public static String GetText(String xpath) {
            WebDriver driver = WebDriverManager.getDriver();
            return  driver.findElement(By.xpath(xpath)).getText();
        }

        public static void WaitFor(String xPath) {
            WebDriver driver = WebDriverManager.getDriver();
//            WebDriverWait driverWait = WebDriverManager.getDriverWait();
//            WebElement element;


            WebElement successuploadFound8 = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));

            WebDriverManager.Sleep(1000);
//            try {
//                element = driverWait
//                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
//            } catch (Throwable e) {
//                element = null;
//            }
//            WebDriverManager.Sleep(2000);
        }

        public static void Disappear(String sxpath) {
            WebDriver driver = WebDriverManager.getDriver();

            Boolean successMesage24 = (new WebDriverWait(driver, 150))
                    .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sxpath)));
        }
    }
}
