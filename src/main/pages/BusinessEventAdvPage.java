import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessEventAdvPage extends  PageBase{
    public BusinessEventAdvPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(tagName = "h1") WebElement title;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div/a/h4") WebElement trainingCard;
    public void clickTrainingCard(){
        clickBtn(trainingCard);
    }

}
