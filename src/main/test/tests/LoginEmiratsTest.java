import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginEmiratsTest extends TestBase{
    HomePage homeObj;
    EmiratsBenefitsPage emiratsBenefitsPageObj;
    @Test(priority = 1)
    public void checkSuccessfulLogin(){
        homeObj = new HomePage(driver);
        emiratsBenefitsPageObj = new EmiratsBenefitsPage(driver);
        homeObj.clickBenefitsForEmirats();
        emiratsBenefitsPageObj.clickBuildHomeLink();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        emiratsBenefitsPageObj.clickLandsAndHomesSection();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        emiratsBenefitsPageObj.clickexchangeLandLink();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       driver.getPageSource().contains(prop.getProperty("exchange_land_link").toString());


    }
}
