package com.pacificgeotech.framework.PO.Environments;

import com.pacificgeotech.framework.core.Msg;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Browser {

    public static void CleanUp() {
        if (Browser.HeadlessBrowser.equals("false")) {
            driver.quit();
            System.out.println("All Windows Closed successfully ");
        }

    }

    public static final String Environments = System.getProperty("Environment");
    //  public static final String HeadlessBrowser = System.getProperty("HeadlessBrowser");
    public static final String HeadlessBrowser = "false";
    public static WebDriver driver;
    public static WebDriverWait wait;

    static final TestBrowser browser = TestBrowser.Chrome;            // Options: Chrome, IE, Firefox

    // use it as  parameter
    // public static final Environment environment = Environment.valueOf(Environments);
    public static Environment environment = Environment.Remote;// Environment.Dev; // Options: Local, Admin, Dev;//Environment.Dev;  Remote


    public static int Mill_Sec() {

        if (Browser.environment.equals(Environment.Remote)) {
            int Sleep_time = 1200;
            return Sleep_time;
        } else {
            int Sleep_time = 1200;
            return Sleep_time;
        }

    }


    public static void UserAccess() {

        //TestBrowser browser = TestBrowser.Chrome;            // Options: Chrome, IE, Firefox
        //Environment environment = Environment.Admin; // Options: Local, Admin, Dev

        Msg.Info("Navigate to the Login (User Access) page");

        SetupTest(browser, environment);

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Msg.Done();
    }

    public static class Goto {

        public static void LoginPage() {
            // driver = WebDriverManager.getDriver();
            if (Browser.HeadlessBrowser.equals("true")) {
                System.out.println("===========================================");
                System.out.println("Which Environment  =  " + System.getProperty("Environment"));
                System.out.println("Running on Headless mode  = " + System.getProperty("HeadlessBrowser"));
                System.out.println("============================================");
            }

            Msg.Info("env" + environment);
            Msg.Done();
            Msg.Info("Navigate to the Login page");
            Msg.Done();
            Browser.Sleep(Document_path.Mill_Sec());


            switch (environment) {
                case Local:
                    driver.get(" https://rat1:31080/epermit");
                    // driver.get("http://cheetah-vm1:31080/epermit");

                    driver.manage().window().maximize();
                    try {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id=\"details-button\"]"))).click();
                        Browser.Sleep(Browser.Mill_Sec());
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"proceed-link\"]"))).click();
                    } catch (Exception e) {
                    }

                    try {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id=\"details-button\"]"))).click();
                        Browser.Sleep(Browser.Mill_Sec());
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"proceed-link\"]"))).click();
                    } catch (Exception e) {
                    }

                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsernameInTxtId"))).sendKeys("agent");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginPasswordInTxtId"))).sendKeys("agent");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitCmdBtnId"))).click();
                    break;

                case Remote:
                    driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
                    driver.manage().deleteAllCookies();
                    driver.get("https://ams-epm-tst.bcogc.ca");
                    //driver.get("https://ams-epm-dev.bcogc.ca/");
                    driver.manage().window().maximize();

                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsernameInTxtId"))).sendKeys("agent");
                    //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsernameInTxtId"))).sendKeys("eutoaxen");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginPasswordInTxtId"))).sendKeys("atomicberriestemptwhack4T");
//                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginPasswordInTxtId"))).sendKeys("agent");
                    //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginPasswordInTxtId"))).sendKeys("BCogc2013");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeSelector"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeExternal"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
//                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeBcogc"))).click();
//                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitCmdBtnId"))).click();
                    break;
                case Dev:
                    driver.get("https://ams-epm-tst.bcogc.ca");
                    //  driver.get(" http://cheetah-vm1:31080/epermit/login.jsf");
                    break;

                case UAT:
                    driver.get("https://ams-epm-uat.bcogc.ca");

                    driver.manage().window().maximize();

                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsernameInTxtId"))).sendKeys("agent");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginPasswordInTxtId"))).sendKeys("atomicberriestemptwhack4T");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitCmdBtnId"))).click();


                    break;


                case STAGING:
                    driver.get("https://ams-epm-stg.bcogc.ca");

                    driver.manage().window().maximize();

                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsernameInTxtId"))).sendKeys("agent");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginPasswordInTxtId"))).sendKeys("atomicberriestemptwhack4T");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitCmdBtnId"))).click();


                    break;

            }
            Msg.Done();
        }

        public static void CRDLoginPage() {

            if (Browser.HeadlessBrowser.equals("true")) {
                System.out.println("===========================================");
                System.out.println("Which Environment  =  " + System.getProperty("Environment"));
                System.out.println("Running on Headless mode  = " + System.getProperty("HeadlessBrowser"));
                System.out.println("============================================");
            }


            Msg.Info("env" + environment);
            Msg.Done();
            Msg.Info("Navigate to the CRD page");
            Browser.Sleep(Document_path.Mill_Sec());

            switch (environment) {
                case Local:
                    driver.get("https://rat1:31081/crd");

//                    driver.get("http://cheetah-vm1:31081/crd/login");

                    driver.manage().window().maximize();
                    try {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id=\"details-button\"]"))).click();
                        Browser.Sleep(Browser.Mill_Sec());
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"proceed-link\"]"))).click();
                    } catch (Exception e) {
                    }

                    try {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id=\"details-button\"]"))).click();
                        Browser.Sleep(Browser.Mill_Sec());
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"proceed-link\"]"))).click();
                    } catch (Exception e) {
                    }

                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))).sendKeys("admin");
                    Browser.Sleep(500);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("12345678");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeSelector"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeInternal"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginSubmit"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    break;

                case Remote:
                    driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
                    driver.manage().deleteAllCookies();
                    driver.get("https://ams-crd-tst.bcogc.ca");
                   //driver.get("https://ams-crd-dev.bcogc.ca/");

                    Browser.Sleep(Browser.Mill_Sec());

                    driver.manage().window().maximize();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))).sendKeys("admin");
                    Browser.Sleep(500);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("12345678");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeSelector"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeInternal"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginSubmit"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    break;
                case Dev:
                    driver.get("https://ams-crd-tst.bcogc.ca");
                    //  driver.get("http://cheetah-vm1:31081/crd/login");
                    break;
                case UAT:
                    driver.get("https://ams-crd-uat.bcogc.ca");
                    //  driver.get("http://cheetah-vm1:31081/crd/login");
                    Browser.Sleep(Browser.Mill_Sec());

                    driver.manage().window().maximize();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))).sendKeys("admin");
                    Browser.Sleep(500);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("12345678");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeSelector"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id=\"authTypeSelector\"]//option[@value=\"internal\"]"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginSubmit"))).click();
                    Browser.Sleep(Browser.Mill_Sec());

                    break;

                case STAGING:
                    driver.get("https://ams-crd-stg.bcogc.ca");
                    Browser.Sleep(Browser.Mill_Sec());

                    driver.manage().window().maximize();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))).sendKeys("admin");
                    Browser.Sleep(500);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("12345678");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeSelector"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id=\"authTypeSelector\"]//option[@value=\"internal\"]"))).click();
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginSubmit"))).click();
                    Browser.Sleep(Browser.Mill_Sec());

                    break;
            }

            Msg.Done();
        }
    }


    private static void SetupTest(TestBrowser browser, Environment environment) {
        switch (browser) {
            case Firefox:

                File file = new File("E:\\repo\\Localtest-Colombia\\LOCAL TEST-COLOMBIA\\AutomationRegressionTests\\lib\\geckodriver.exe");

                System.setProperty("webdriver.gecko.driver",
                        file.getAbsolutePath());


                DesiredCapabilities capabilities = DesiredCapabilities.firefox();

                //   FirefoxOptions options = new FirefoxOptions();


                FirefoxProfile fxProfile = new FirefoxProfile();
                fxProfile.setPreference("browser.download.folderList", 2);
                fxProfile.setPreference("browser.download.manager.showWhenStarting", false);

                FirefoxOptions options = new FirefoxOptions().setProfile(fxProfile);

                capabilities.setCapability("browser.privatebrowsing.autostart", true);
                options.addPreference("dom.webnotifications.enabled", false);
                capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
                capabilities.setCapability("marionette", true);
                capabilities.setCapability("firefox.binary", file.getAbsolutePath());
                // capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
                options.addPreference("media.navigator.permission.disabled", true);
                options.addPreference("media.navigator.streams.fake", true);

                options.merge(capabilities);

                driver = new FirefoxDriver(options);

                wait = new WebDriverWait(driver, 80);
                break;

            case Chrome:
                System.out.println("Invoking Chrome Browser");
                File file1 = new File(Document_path.ChromePath);

                System.setProperty("webdriver.chrome.driver",
                        file1.getAbsolutePath());

//                WebDriverManager.chromedriver().setup();

                DesiredCapabilities Chromecapabilities = DesiredCapabilities.chrome();

                ChromeOptions Choptions = new ChromeOptions();

                Choptions.addArguments("test-type");
                Choptions.addArguments("disable-infobars");
                Choptions.addArguments("'--start-maximized", "--window-size=1920,1080");
                Choptions.addArguments("--disable-extensions");
                Choptions.addArguments("--incognito");
                //   Choptions.addArguments("--headless","--window-size=1920,1080");

                if (Browser.HeadlessBrowser.equals("true")) {
                    Choptions.setHeadless(Boolean.parseBoolean(HeadlessBrowser));
                }
                //       Choptions.addArguments("--disable-gpu");
//                Chromecapabilities.setCapability("chrome.binary", file1.getAbsolutePath());
                Chromecapabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
                Chromecapabilities.setCapability(ChromeOptions.CAPABILITY, Choptions);
                Choptions.merge(Chromecapabilities);

                driver = new ChromeDriver(Choptions);

                wait = new WebDriverWait(driver, 80);
                System.out.println(" Chrome Browser Invoked Successfully");
                break;
            case IE:

                File filee = new File("\\lib\\IEDriverServer.exe");

                System.setProperty("webdriver.ie.driver",
                        filee.getAbsolutePath());

                DesiredCapabilities capabilities1 = DesiredCapabilities.internetExplorer();


                InternetExplorerOptions options1 = new InternetExplorerOptions();
                //.requireWindowFocus();

                capabilities1.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
                capabilities1.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, 1);
                capabilities1.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capabilities1.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

                options1.setCapability("InPrivate", true);
                options1.enablePersistentHovering();
                //    options.waitForUploadDialogUpTo(Duration.ofSeconds(100));
                options1.merge(capabilities1);
                driver = new InternetExplorerDriver(options1);
                wait = new WebDriverWait(driver, 80);

                break;

            default:
                DesiredCapabilities capabilities2 = DesiredCapabilities.edge();

                EdgeOptions options2 = new EdgeOptions();
                capabilities2.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
                capabilities2.setCapability("ms:inPrivate", true);
                options2.setCapability("InPrivate", true);

                options2.merge(capabilities2);
                driver = new EdgeDriver(options2);

                wait = new WebDriverWait(driver, 80);
                break;

        }

        switch (environment) {
            case Local:

                //   driver.get("https://ams-crd-tst.bcogc.ca");
                break;
            case STAGING:

                //  driver.get("https://ams-crd-tst.bcogc.ca");
                break;
            case Dev:
                //   driver.get("https://ams-crd-tst.bcogc.ca");
                break;
            case Remote:
                //   driver.get("https://ams-crd-tst.bcogc.ca");
                break;
        }

    }

    public static void Sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public enum TestBrowser {
        Firefox(1),
        Chrome(2),
        IE(3);

        private final int browserCode;

        private TestBrowser(int browserCode) {
            this.browserCode = browserCode;
        }


    }

    public enum Environment {
        Local(1),
        STAGING(2),
        Dev(3),
        Remote(4),
        UAT(5);


        private final int environmentCode;

        private Environment(int browserCode) {
            this.environmentCode = browserCode;
        }
    }


}