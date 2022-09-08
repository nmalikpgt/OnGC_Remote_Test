package com.pacificgeotech.framework.core;


import static com.pacificgeotech.framework.PO.Environments.Document_path.ChromePath;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Shapefile;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;


/**
 * @author scheong
 * <p>
 * SantaClaus: a combination of a singleton and a factory. There's only
 * one and he gives presents!
 * <p>
 * Use a singleton to manage access to global objects. Reusing the same
 * WebElement will minimize garbage collector usage.
 */
public final class WebDriverManager {

    private static WebDriverManager instance = null;

    // web driver objects
    private static WebDriver driver = null;
    private static WebDriverWait driverWait = null;
    private static WebElement element = null;
    private static List<WebElement> elements = null;
    public static Select select = null;
    //private static WebDriver driver1 = null;

    /**
     * private ctor - initialize everything
     */
    public static void Initialize() {
        WebDriver driver = WebDriverManager.getDriver();
        WebDriverWait driverWait = WebDriverManager.getDriverWait();
        WebElement element = WebDriverManager.getElement();
        List<WebElement> elements = WebDriverManager.getElements();
        Actions builder = new Actions(driver);


        // login
        Msg.Info("Login to ePermit");
        try {
            CommonUtils.loginePermit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Msg.Done();
    }

    public static void InitializeCRD() {
        WebDriver driver = WebDriverManager.getDriver();
        WebDriverWait driverWait = WebDriverManager.getDriverWait();
        WebElement element = WebDriverManager.getElement();
        List<WebElement> elements = WebDriverManager.getElements();
        Actions builder = new Actions(driver);
        driver.manage().window().maximize();

        // login
        Msg.Info("Login to ePermit");
        try {
            CommonUtils.loginCRD();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Msg.Done();
    }

    public static void Sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private WebDriverManager() {
        driver = initDriver();
        driverWait = (new WebDriverWait(driver, Config.TIMEOUT));
        element = null;
        elements = null;
        select = null;
    }

    public static WebDriverManager getInstance() {
        if (instance == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    private static WebDriver initDriver() {

        if (Config.SELECTED_DRIVER.equals(Constants.CHROME_DRIVER)) {

            File file = new File(ChromePath);

            System.setProperty("webdriver.chrome.driver",
                    file.getAbsolutePath());

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();

            ChromeOptions options = new ChromeOptions();


            options.addArguments("test-type");
            options.addArguments("disable-infobars");
            options.addArguments("'--start-maximized", "--window-size=1920,1080");
            options.addArguments("--disable-extensions");
            options.addArguments("--incognito");
            //     options.addArguments("headless");
            capabilities.setCapability("chrome.binary", file.getAbsolutePath());
            capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            options.merge(capabilities);

            driver = new ChromeDriver(options);

//            HashMap<String, Object> chromePref = new HashMap<>();
//
//            chromePref.put("download.default_directory", "E:\\repo\\Downloaded files for all the projects");
//
//            options.setExperimentalOption("prefs", chromePref);
//
//
//            capabilities.setCapability("chrome.binary", file.getAbsolutePath());
//
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//            options.merge(capabilities);
//
//            driver = new ChromeDriver(options);


          //  driver = new ChromeDriver(capabilities);


        }

        else if (Config.SELECTED_DRIVER.equals(Constants.EDGE_DRIVER)) {


            DesiredCapabilities capabilities = DesiredCapabilities.edge();

            EdgeOptions options = new EdgeOptions();
            capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
            capabilities.setCapability("ms:inPrivate", true);
            options.setCapability("InPrivate", true);

            options.merge(capabilities);
            driver = new EdgeDriver(options);





        }


        else if (Config.SELECTED_DRIVER.equals(Constants.IE)) {

            File file = new File("\\lib\\IEDriverServer.exe");

            System.setProperty("webdriver.ie.driver",
                    file.getAbsolutePath());

            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();


            InternetExplorerOptions options = new InternetExplorerOptions();
                    //.requireWindowFocus();

            capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            capabilities.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, 1);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

            options.setCapability("InPrivate", true);
            options.enablePersistentHovering();
        //    options.waitForUploadDialogUpTo(Duration.ofSeconds(100));
            options.merge(capabilities);
            driver = new InternetExplorerDriver(options);


        }


        else if (Config.SELECTED_DRIVER.equals(Constants.GHOST_DRIVER)) {

            File file = new File("lib/phantomjs.exe");

            Capabilities caps = new DesiredCapabilities();

            ((DesiredCapabilities) caps).setJavascriptEnabled(true);

            ((DesiredCapabilities) caps).setCapability("takesScreenshot", true);

            ((DesiredCapabilities) caps).setCapability(

                    PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,

                    file.getAbsolutePath()

            );

            driver = new PhantomJSDriver(caps);

        } else if (Config.SELECTED_DRIVER.equals(Constants.FIREFOX_DRIVER)) {

            driver = new FirefoxDriver();

        }

        return driver;

    }

    public static WebDriver getDriver() {
        return getInstance().driver;
    }

    public static WebDriverWait getDriverWait() {
        return getInstance().driverWait;
    }

    public static WebElement getElement() {
        return getInstance().element;
    }

    public static List<WebElement> getElements() {
        return getInstance().elements;
    }

    public static Select getSelect() {
        return getInstance().select;
    }

}
