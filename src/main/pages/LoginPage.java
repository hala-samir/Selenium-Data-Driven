
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className="ui-lib-uaepass-button") public WebElement loginBtn;

}