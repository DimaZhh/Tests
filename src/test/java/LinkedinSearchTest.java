import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkedInSearchPage;
import pages.LinkedinHomePage;

import java.util.List;

public class LinkedinSearchTest extends BaseTest{

    @Test
    public void checkLinkedInSearchFunctionality() throws Exception {
        Assert.assertTrue(linkedinLoginPage.isPageLoaded(), "Login page is not loaded");

        LinkedinHomePage linkedinHomePage = linkedinLoginPage.login("clarizenapi@gmail.com", "MadjikMadjik123");

        Assert.assertTrue(linkedinHomePage.isPageLoaded(), "Home page is not loaded");

        LinkedInSearchPage linkedInSearchPage = linkedinHomePage.search("Automation QA");

        Assert.assertTrue(linkedInSearchPage.isPageLoaded(), "LinkedIn Search page is not displayed");

        List<String> searchResult = linkedInSearchPage.getSearchResults();

        for (String elementText : searchResult) {
            Assert.assertTrue(elementText.toLowerCase().contains("Automation".toLowerCase()) ||
                            elementText.toLowerCase().contains("QA".toLowerCase()),
                    "Search Text not found in returned results");
        }

        Assert.assertTrue(linkedInSearchPage.getSearchResultSize()>0, "Size Is Empty");
    }
}
