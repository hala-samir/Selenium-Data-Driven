import data.LoadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToLoginPageTest extends TestBase {
    HomePage homeObj;
    StartManageBusinessPage startManageBusinessObj;
    StepByStepBusinessGuidePage stepByStepBusinessObj;
    LoginPage loginPageObj;
    @Test(priority = 1)
    public void userCanRegisterSuccessfully() throws InterruptedException {
        homeObj = new HomePage(driver);
        loginPageObj = new LoginPage(driver);
        startManageBusinessObj = new StartManageBusinessPage(driver);
        stepByStepBusinessObj = new StepByStepBusinessGuidePage(driver);
        homeObj.clickStartManageCard();
        Assert.assertEquals(true, startManageBusinessObj.pageContainer.isDisplayed());
        startManageBusinessObj.clickStepByStepBusinessGuide();
        //assertions of question1 and answers
        Assert.assertEquals(stepByStepBusinessObj.questionTitle.getText(), prop.getProperty("question1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(),prop.getProperty("question1_option1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), prop.getProperty("question1_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), prop.getProperty("question1_option3").toString());
        Assert.assertEquals(stepByStepBusinessObj.option4.getText(), prop.getProperty("question1_option4").toString());
        Assert.assertEquals(stepByStepBusinessObj.option5.getText(),prop.getProperty("question1_option5").toString());
        Assert.assertEquals(stepByStepBusinessObj.option6.getText(),prop.getProperty("question1_option6").toString());
        stepByStepBusinessObj.option1.click();
        stepByStepBusinessObj.nextBtn.click();
        //assertions of question2 and answers
        Assert.assertTrue(stepByStepBusinessObj.questionTitle.getText().contains(prop.getProperty("question2").toString()) );
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(), prop.getProperty("question2_option1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), prop.getProperty("question2_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), prop.getProperty("question2_option3").toString());
        stepByStepBusinessObj.option3.click();
        //previous answer
        Assert.assertEquals(stepByStepBusinessObj.previousAnswer.getText(),prop.getProperty("question1_option1").toString());
        stepByStepBusinessObj.nextBtn.click();
        //assertions of question3 and answers
        Assert.assertTrue(stepByStepBusinessObj.questionTitle.getText().contains(prop.getProperty("question3").toString()));
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(), prop.getProperty("question3_option1").toString() );
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), prop.getProperty("question3_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), prop.getProperty("question3_option3").toString());
        Assert.assertEquals(stepByStepBusinessObj.option4.getText(), prop.getProperty("question3_option4").toString());
        Assert.assertEquals(stepByStepBusinessObj.option5.getText(), prop.getProperty("question3_option5").toString());
        stepByStepBusinessObj.option1.click();
        //previous answers
        Assert.assertTrue(stepByStepBusinessObj.secondAnswer.getText().contains(prop.getProperty("question2_option3").toString()));
        Assert.assertTrue(stepByStepBusinessObj.firstAnswer.getText().contains(prop.getProperty("question1_option1").toString()));
        stepByStepBusinessObj.nextBtn.click();
        Assert.assertEquals(loginPageObj.loginBtn.isDisplayed(), true);
    }
}