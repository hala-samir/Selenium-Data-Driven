import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class PageBase {
    protected WebDriver driver;
    //constructor
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    protected void clickBtn(WebElement btn) {
        btn.click();
    }
}

