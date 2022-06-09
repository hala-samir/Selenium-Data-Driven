import org.testng.Assert;
import org.testng.annotations.Test;

public class TrainingRequestTest extends  TestBase{
    HomePage homePageObj;
    BusinessEventAdvPage businessEventAdvPageObj;
    RequestTrainingPage requestTrainingPageObj;
    LoginPage loginPageObj;
    @Test(priority = 1)
    public void userCanRequestTraining() throws InterruptedException {
        homePageObj = new HomePage(driver);
        homePageObj.clickBusinessEventAdvCard();
        businessEventAdvPageObj = new BusinessEventAdvPage(driver);
        Assert.assertEquals(businessEventAdvPageObj.title.getText(), prop.getProperty("business_event_page_title").toString());
        businessEventAdvPageObj.clickTrainingCard();
        requestTrainingPageObj = new RequestTrainingPage(driver);
        Assert.assertEquals(requestTrainingPageObj.pageTitle.getText(), prop.getProperty("request_training_page_title").toString());
        requestTrainingPageObj.clickstartBtn();
        loginPageObj = new LoginPage(driver);
        Assert.assertEquals(loginPageObj.loginBtn.isDisplayed(), true);
    }
}
