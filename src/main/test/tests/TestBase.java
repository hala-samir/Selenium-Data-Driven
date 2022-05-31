import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import data.LoadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.*;

public class TestBase
{
    public static WebDriver driver;
    public static FirefoxOptions firefoxOption() {
        FirefoxOptions option= new FirefoxOptions();
        option.addPreference("browser.download.folderList", 2);
        option.addPreference("browser.helperApps.neverAsk.SaveToDisk", "application/pdf,application/octet-stream");
        option.addPreference("browser.download.manager.showWhenStarting",false);
        option.addPreference("pdfjs.disabled", true);
        return option;
    }
    public static ChromeOptions chromeOption() {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs= new HashMap<String, Object>();
        chromePrefs.put("profile.default.content_settings.popups", 0);
        options.setExperimentalOption("prefs",chromePrefs);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return options;
    }
    @BeforeSuite
    @Parameters({"browser"})
    public void StartDriver(@Optional("chrome")String browserName){
        if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/driver/geckodriver");
            driver=new FirefoxDriver(firefoxOption());
        }
        else if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
            driver=new ChromeDriver(chromeOption());
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       driver.navigate().to(LoadProperties.data.getProperty("url").toString());
    }
    @AfterSuite
    public void stopDriver() {
        driver.quit();
    }
}