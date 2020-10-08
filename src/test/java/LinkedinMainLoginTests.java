import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkedInSearchPage;
import pages.LinkedinHomePage;

public class LinkedinMainLoginTests extends BaseTest {

    @Test
    public void searchSomeDataUsingGoogleForm() throws Exception {
        Assert.assertTrue(linkedinLoginPage.isPageLoaded(), "Login page is not loaded");

        LinkedinHomePage linkedinHomePage = linkedinLoginPage.login("clarizenapi@gmail.com", "MadjikMadjik123");

        Assert.assertTrue(linkedinHomePage.isPageLoaded(), "Home page is not loaded");
    }

    @Test
    public void checkLinkedInSearchFunctionality() throws Exception {
        Assert.assertTrue(linkedinLoginPage.isPageLoaded(), "Login page is not loaded");

        LinkedinHomePage linkedinHomePage = linkedinLoginPage.login("clarizenapi@gmail.com", "MadjikMadjik123");

        Assert.assertTrue(linkedinHomePage.isPageLoaded(), "Home page is not loaded");

        LinkedInSearchPage linkedInSearchPage = linkedinHomePage.search("Automation QA");

        Assert.assertTrue(linkedInSearchPage.isPageLoaded(), "LinkedIn Search page is not displayed");
    }
}
