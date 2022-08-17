import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ExchangeLandPage extends  PageBase{
    public ExchangeLandPage(WebDriver driver) {
        super(driver);
        builder = new Actions(driver);
    }
    @FindBy(css = "button[aria-label='button-primary']")
    WebElement startBtn;
    public void clickStartBtn() {
        builder.moveToElement(startBtn).click().perform();
    }
}
