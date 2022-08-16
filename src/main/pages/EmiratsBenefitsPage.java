import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.*;

public class EmiratsBenefitsPage extends PageBase{
    public EmiratsBenefitsPage(WebDriver driver) {
        super(driver);
        js= (JavascriptExecutor) driver;
        builder = new Actions(driver);
    }

    @FindBy(css= ".ui-lib-side-navigation-header-row:nth-child(1)")
    WebElement buildHomeLink;
   public void clickBuildHomeLink(){
       clickBtn(buildHomeLink);
   }
   @FindBy(css = ".ui-lib-side-navigation-header-row__title.ui-lib-side-navigation-header-row__title_active")
   WebElement landsAndHomesSection;
   public  void clickLandsAndHomesSection(){
       clickBtn(landsAndHomesSection);
   }
    @FindBy (xpath= "//a[contains(@href,'Grants/requestofexchangelandforland')]")
    WebElement exchangeLandLink;
    public void clickexchangeLandLink(){
       boolean x = exchangeLandLink.isDisplayed();
       System.out.println("element is displayed "+ x);
        scrollDown();
        builder.moveToElement(exchangeLandLink).click().perform();
    }
}
