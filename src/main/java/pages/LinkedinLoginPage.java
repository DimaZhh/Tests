package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinLoginPage extends BasePage{

    @FindBy(id = "username")
    private WebElement userEmailField;

    @FindBy(id = "password")
    private WebElement userPasswordField;

    @FindBy(xpath = "//button[@data-litms-control-urn='login-submit']")
    private WebElement enterButton;

    public LinkedinLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        assertElementIsVisible(enterButton, 5, "Login page is not loaded.");
    }
}
