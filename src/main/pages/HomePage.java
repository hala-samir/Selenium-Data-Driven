import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
        action= new Actions(driver);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[2]/div/div/div/div/div[3]/a")WebElement startManageCard;

    public void clickStartManageCard() {
        clickBtn(startManageCard);
    }

}