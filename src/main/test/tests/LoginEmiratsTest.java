import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginEmiratsTest extends TestBase{
    HomePage homeObj;
    @Test(priority = 1)
    public void checkSuccessfulLogin(){
        homeObj = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        homeObj.clickBenefitsForEmirats();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.getPageSource().contains(prop.getProperty("exchange_land_link").toString());

    }
}
