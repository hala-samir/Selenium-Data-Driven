import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
        @FindBy(xpath = "(//div[@class='tpn-custom-grid__item TPN-categories TPN-categories--all-Links'])[4]")
    WebElement startManageCard;
    public void clickStartManageCard() {
        clickBtn(startManageCard);
    }
    @FindBy (xpath= "//a[contains(@href,'/benefits-for-emiratis')]")
    WebElement benefitsForEmirats;
    public void clickBenefitsForEmirats() {
        clickBtn(benefitsForEmirats);
    }
}