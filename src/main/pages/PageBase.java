import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    protected WebDriver driver;
    public Select select;
    public Actions action;
    //constructor
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    protected static void clickBtn(WebElement btn)
    {
        btn.click();
    }
    protected static void setTxt(WebElement txtElement, String txt)
    {
        txtElement.sendKeys(txt);
    }
    public void clearTxt(WebElement element)
    {
        element.clear();
    }
}

