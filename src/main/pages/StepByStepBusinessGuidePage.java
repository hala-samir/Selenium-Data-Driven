import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StepByStepBusinessGuidePage extends PageBase{
    public StepByStepBusinessGuidePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "ui-lib-questionnaire-question__title") public WebElement questionTitle;
    @FindBy(className = "ui-lib-radio-group__items") public WebElement optionsSection;
    @FindBy(css = ".ui-lib-radio-group__items>label:nth-child(1)") public WebElement option1;
    @FindBy(css = ".ui-lib-radio-group__items>label:nth-child(2)") public WebElement option2;
    @FindBy(css = ".ui-lib-radio-group__items>label:nth-child(3)") public WebElement option3;
    @FindBy(css = ".ui-lib-radio-group__items>label:nth-child(4)") public WebElement option4;
    @FindBy(css = ".ui-lib-radio-group__items>label:nth-child(5)") public WebElement option5;
    @FindBy(css = ".ui-lib-radio-group__items>label:nth-child(6)") public WebElement option6;
    @FindBy(className = "ui-lib-questionnaire-answer__content-text") public WebElement previousAnswer;
    @FindBy(className = "ui-lib-questionnaire-question__controls-main") public WebElement nextBtn;
    @FindBy(css=".ui-lib-questionnaire-answer:nth-child(2)") public WebElement secondAnswer;
    @FindBy(css=".ui-lib-questionnaire-answer:nth-child(3)") public WebElement firstAnswer;
}
