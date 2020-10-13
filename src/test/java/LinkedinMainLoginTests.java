import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LinkedInSearchPage;
import pages.LinkedinHomePage;
import pages.LinkedinLoginPage;
import pages.LinkedinLoginSubmitPage;

import java.io.IOException;

public class LinkedinMainLoginTests extends BaseTest {

    @DataProvider
    public Object[][] validDataProvider() {
        return new Object[][]{
                {"clarizenapi@gmail.com", "MadjikMadjik123"},
                {"clarizenapi@gmail.com", "MadjikMadjik123"}
        };
    }

    @DataProvider
    public Object[][] notValidDataProvider() {
        return new Object[][]{
                {"dasdsad12312@gmail.com", "wrong12312312"}
        };
    }

    @Test(dataProvider = "validDataProvider")
    public void searchSomeDataUsingGoogleForm(String userEmail, String userPassword) throws Exception {
        Assert.assertTrue(linkedinLoginPage.isPageLoaded(), "Login page is not loaded");

        LinkedinHomePage linkedinHomePage = linkedinLoginPage.login(userEmail, userPassword);

        Assert.assertTrue(linkedinHomePage.isPageLoaded(), "Home page is not loaded");
    }

    @Test(dataProvider = "validDataProvider")
    public void checkLinkedInSearchFunctionality(String userEmail, String userPassword) throws Exception {
        Assert.assertTrue(linkedinLoginPage.isPageLoaded(), "Login page is not loaded");

        LinkedinHomePage linkedinHomePage = linkedinLoginPage.login(userEmail, userPassword);

        Assert.assertTrue(linkedinHomePage.isPageLoaded(), "Home page is not loaded");

        LinkedInSearchPage linkedInSearchPage = linkedinHomePage.search("Automation QA");

        Assert.assertTrue(linkedInSearchPage.isPageLoaded(), "LinkedIn Search page is not displayed");
    }

    @Test
    public void emptyUserEmailAndUserPasswordTest() throws IOException {
        Assert.assertTrue(linkedinLoginPage.isPageLoaded(), "Login page is not loaded");

        LinkedinLoginPage linkedinLoginPages = linkedinLoginPage.login("", "");

        Assert.assertTrue(linkedinLoginPages.isPageLoaded(), "Home page is not loaded");
    }

    @Test(dataProvider = "notValidDataProvider")
    public void negativeLoginTest(String userEmail, String userPassword) throws Exception {
        Assert.assertTrue(linkedinLoginPage.isPageLoaded(), "Login page is not loaded");

        LinkedinLoginSubmitPage linkedinSubmitPage = linkedinLoginPage.login(userEmail, userPassword);

        Assert.assertTrue(linkedinSubmitPage.isPageLoaded(), "Submit page is loaded");

        Assert.assertEquals(linkedinSubmitPage.getErrorMessageForUserName(), "Hmm, we don't recognize that email. Please try again.");
    }
}
