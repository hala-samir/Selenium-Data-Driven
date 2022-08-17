import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartManageBusinessPage extends PageBase{
    public StartManageBusinessPage(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }
    @FindBy(xpath =  "//a[contains(@href,'/licences/user-guide')]")
    WebElement businessGuideLink;
    public void clickBusinessGuideLink(){
        scrollDown();
        js.executeScript("arguments[0].click();", businessGuideLink);
    }
}
