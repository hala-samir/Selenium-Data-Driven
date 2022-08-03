import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[2]/div/div/div/div/div[3]/a")
    WebElement startManageCard;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[2]/div/div/div/div/div[2]/a")
    WebElement businessEventAdvCard;
    public void clickStartManageCard() {

        clickBtn(startManageCard);
    }
    public void clickBusinessEventAdvCard() {
        clickBtn(businessEventAdvCard);
    }
    @FindBy (xpath= "//a[contains(@href,'/aspects-of-life/benefits-for-emiratis')]")
    WebElement benefitsForEmirats;
    public void clickBenefitsForEmirats() {
        clickBtn(benefitsForEmirats);
    }
}