import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestTrainingPage extends PageBase{
    public RequestTrainingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(tagName = "h1")
    WebElement pageTitle;
    @FindBy(className = "ui-lib-start-login_buttons") WebElement startBtn;
    public void clickstartBtn(){
        clickBtn(startBtn);
    }
}
