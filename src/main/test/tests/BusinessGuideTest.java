import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BusinessGuideTest extends TestBase{
    HomePage homeObj;
    StartManageBusinessPage startManageBusinessPageObj;
    StepByStepBusinessGuidePage stepByStepBusinessObj;
    LoginPage loginPageObj;
    @Test(priority = 1)
    public void checkBusinessGuide(){
        homeObj = new HomePage(driver);
        startManageBusinessPageObj = new StartManageBusinessPage(driver);
        stepByStepBusinessObj = new StepByStepBusinessGuidePage(driver);
        loginPageObj = new LoginPage(driver);
        homeObj.clickStartManageCard();
        driver.getPageSource().contains(prop.getProperty("start_manage_business").toString());
        System.out.println(prop.getProperty("start_manage_business").toString());
        startManageBusinessPageObj.clickBusinessGuideLink();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Assert.assertEquals(stepByStepBusinessObj.questionTitle.getText(), prop.getProperty("question1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(),prop.getProperty("question1_option1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), prop.getProperty("question1_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), prop.getProperty("question1_option3").toString());
        Assert.assertEquals(stepByStepBusinessObj.option4.getText(), prop.getProperty("question1_option4").toString());
        Assert.assertEquals(stepByStepBusinessObj.option5.getText(), prop.getProperty("question1_option5").toString());
        Assert.assertEquals(stepByStepBusinessObj.option6.getText(), prop.getProperty("question1_option6").toString());
        stepByStepBusinessObj.option1.click();
        stepByStepBusinessObj.nextBtn.click();
        Assert.assertTrue(stepByStepBusinessObj.questionTitle.getText().contains(prop.getProperty("question2").toString()) );
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(), prop.getProperty("question2_option1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), prop.getProperty("question2_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), prop.getProperty("question2_option3").toString());
        stepByStepBusinessObj.option3.click();
        Assert.assertEquals(stepByStepBusinessObj.previousAnswer.getText(),prop.getProperty("question1_option1").toString());
        stepByStepBusinessObj.nextBtn.click();

        Assert.assertTrue(stepByStepBusinessObj.questionTitle.getText().contains(prop.getProperty("question3").toString()));
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(), prop.getProperty("question3_option1").toString() );
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), prop.getProperty("question3_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), prop.getProperty("question3_option3").toString());
        Assert.assertEquals(stepByStepBusinessObj.option4.getText(), prop.getProperty("question3_option4").toString());
        Assert.assertEquals(stepByStepBusinessObj.option5.getText(), prop.getProperty("question3_option5").toString());
        stepByStepBusinessObj.option1.click();
        Assert.assertTrue(stepByStepBusinessObj.secondAnswer.getText().contains(prop.getProperty("question2_option3").toString()));
        Assert.assertTrue(stepByStepBusinessObj.firstAnswer.getText().contains(prop.getProperty("question1_option1").toString()));
        stepByStepBusinessObj.nextBtn.click();
        Assert.assertEquals(loginPageObj.loginBtn.isDisplayed(), true);

    }
}
;