import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class PageBase {
    protected WebDriver driver;
    public  JavascriptExecutor js;
    public Actions builder;
    //constructor
    public PageBase(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    protected void clickBtn(WebElement btn) {
        btn.click();
    }
    public void scrollDown(){
        js.executeScript("window.scrollBy(0,2500)");
    }


}

