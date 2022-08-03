import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmiratsBenefitsPage extends PageBase{
    public EmiratsBenefitsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= ".ui-lib-side-navigation-header-row:nth-child(1)")
    WebElement buildHomeLink;
   public void clickBuildHomeLink(){
       clickBtn(buildHomeLink);
   }
    @FindBy (xpath= "//a[contains(@href,'/requestofexchangelandforland')]")
    WebElement exchangeLandLink;
    public void clickexchangeLandLink(){
        clickBtn(exchangeLandLink);
    }
}
