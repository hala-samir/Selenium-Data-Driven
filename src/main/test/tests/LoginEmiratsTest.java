import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginEmiratsTest extends TestBase{
    HomePage homeObj;
    EmiratsBenefitsPage emiratsBenefitsPageObj;
    ExchangeLandPage exchangeLandPageObj;
    LoginPage loginPageObj;
    @Test(priority = 1)
    public void checkSuccessfulLogin(){
        homeObj = new HomePage(driver);
        emiratsBenefitsPageObj = new EmiratsBenefitsPage(driver);
        exchangeLandPageObj = new ExchangeLandPage(driver);
        loginPageObj = new LoginPage(driver);

        homeObj.clickBenefitsForEmirats();
        emiratsBenefitsPageObj.clickBuildHomeLink();
        emiratsBenefitsPageObj.clickLandsAndHomesSection();
        emiratsBenefitsPageObj.clickexchangeLandLink();
       driver.getPageSource().contains(prop.getProperty("exchange_land_link").toString());
        exchangeLandPageObj.clickStartBtn();
        driver.getPageSource().contains(prop.getProperty("UAE_pass").toString());
        loginPageObj.clickLoginBtn();




    }
}
