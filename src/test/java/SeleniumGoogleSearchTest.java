import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkedinHomePage;

public class SeleniumGoogleSearchTest extends BaseTest {

    @Test
    public void searchSomeDataUsingGoogleForm () throws Exception {
        Assert.assertTrue(linkedinLoginPage.isPageLoaded(), "Login page is not loaded");

        LinkedinHomePage linkedinHomePage = linkedinLoginPage.login("clarizenapi@gmail.com", "MadjikMadjik123");

        Assert.assertTrue(linkedinHomePage.isPageLoaded(), "Home page is not loaded");

        linkedinHomePage.search("something");

        System.out.println("");
    }
}
