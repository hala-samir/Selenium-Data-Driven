import data.LoadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToLoginPageTest extends TestBase {

    HomePage homeObj;
    StartManageBusinessPage startManageBusinessObj;
    StepByStepBusinessGuidePage stepByStepBusinessObj;
    LoginPage loginPageObj;

    @Test(priority = 1)
    public void userCanRegisterSuccessfully() {
        homeObj = new HomePage(driver);
        startManageBusinessObj = new StartManageBusinessPage(driver);
        stepByStepBusinessObj = new StepByStepBusinessGuidePage(driver);
        loginPageObj = new LoginPage(driver);
        homeObj.clickStartManageCard();
        Assert.assertEquals(true, startManageBusinessObj.pageContainer.isDisplayed());
        startManageBusinessObj.clickStepByStepBusinessGuide();
        //assertions of question1 an answers
        Assert.assertEquals(stepByStepBusinessObj.questionTitle.getText(), LoadProperties.data.getProperty("question1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(),LoadProperties.data.getProperty("question1_option1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), LoadProperties.data.getProperty("question1_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), LoadProperties.data.getProperty("question1_option3").toString());
        Assert.assertEquals(stepByStepBusinessObj.option4.getText(), LoadProperties.data.getProperty("question1_option4").toString());
        Assert.assertEquals(stepByStepBusinessObj.option5.getText(),LoadProperties.data.getProperty("question1_option5").toString());
        Assert.assertEquals(stepByStepBusinessObj.option6.getText(),LoadProperties.data.getProperty("question1_option6").toString());
        stepByStepBusinessObj.option1.click();
        stepByStepBusinessObj.nextBtn.click();
        //assertions of question2 an answers
        Assert.assertTrue(stepByStepBusinessObj.questionTitle.getText().contains(LoadProperties.data.getProperty("question2").toString()) );
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(), LoadProperties.data.getProperty("question2_option1").toString());
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), LoadProperties.data.getProperty("question2_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), LoadProperties.data.getProperty("question2_option3").toString());

        stepByStepBusinessObj.option3.click();

        Assert.assertEquals(stepByStepBusinessObj.previousAnswer.getText(),LoadProperties.data.getProperty("question1_option1").toString());

        stepByStepBusinessObj.nextBtn.click();

        Assert.assertTrue(stepByStepBusinessObj.questionTitle.getText().contains(LoadProperties.data.getProperty("question3").toString()));
        Assert.assertEquals(stepByStepBusinessObj.option1.getText(), LoadProperties.data.getProperty("question3_option1").toString() );
        Assert.assertEquals(stepByStepBusinessObj.option2.getText(), LoadProperties.data.getProperty("question3_option2").toString());
        Assert.assertEquals(stepByStepBusinessObj.option3.getText(), LoadProperties.data.getProperty("question3_option3").toString());
        Assert.assertEquals(stepByStepBusinessObj.option4.getText(), LoadProperties.data.getProperty("question3_option4").toString());
        Assert.assertEquals(stepByStepBusinessObj.option5.getText(), LoadProperties.data.getProperty("question3_option5").toString());

        stepByStepBusinessObj.option1.click();

        Assert.assertTrue(stepByStepBusinessObj.secondAnswer.getText().contains(LoadProperties.data.getProperty("question2_option3").toString()));
        Assert.assertTrue(stepByStepBusinessObj.firstAnswer.getText().contains(LoadProperties.data.getProperty("question1_option1").toString()));

        stepByStepBusinessObj.nextBtn.click();

        Assert.assertEquals(loginPageObj.loginBtn.isDisplayed(), true);
    }
}