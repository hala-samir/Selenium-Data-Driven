import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartManageBusinessPage extends PageBase {
    public StartManageBusinessPage(WebDriver driver) {
        super(driver);
    }
     @FindBy(className = "ui-lib-category-list-dummy") public WebElement pageContainer;
    @FindBy(css = ".ui-lib-highlights-slider__item:nth-child(1)") public WebElement stepByStepBusinessGuideCard;
    public void clickStepByStepBusinessGuide(){
        clickBtn(stepByStepBusinessGuideCard);
    }
}