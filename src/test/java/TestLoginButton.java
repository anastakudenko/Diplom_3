import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PersonalAreaPage;

public class TestLoginButton {
    private WebDriver driver;
    private final String userEmail = "testoviy@akk.com";
    private final String userPassword = "123456R";
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }
    @Test
    @DisplayName("Can Login In Registration Form")
    public void testLoginInRegistrationForm() {
        this.driver.get("https://stellarburgers.nomoreparties.site/register");
        PersonalAreaPage testLoginButton = new PersonalAreaPage(driver);
        testLoginButton.clickLoginButtonInRegistrationForm();
        testLoginButton.setEmail(userEmail);
        testLoginButton.setPassword(userPassword);
        testLoginButton.clickLoginButton();
        testLoginButton.visiblePersonalArea();
    }

    @Test
    @DisplayName("Can Login From Personal Area")
    public void testLoginFromPersonalArea() {
        this.driver.get("https://stellarburgers.nomoreparties.site");
        PersonalAreaPage testLoginButton = new PersonalAreaPage(driver);
        testLoginButton.clickPersonalArea();
        testLoginButton.setEmail(userEmail);
        testLoginButton.setPassword(userPassword);
        testLoginButton.clickLoginButton();
        testLoginButton.visiblePersonalArea();
    }

    @Test
    @DisplayName("Can Login From Recover Password Page")
    public void testLoginFromRecoverPasswordPage() {
        this.driver.get("https://stellarburgers.nomoreparties.site");
        PersonalAreaPage testLoginButton = new PersonalAreaPage(driver);
        testLoginButton.clickPersonalArea();
        testLoginButton.clickRecoverPasswordButton();
        testLoginButton.clickLoginButtonInRegistrationForm();
        testLoginButton.setEmail(userEmail);
        testLoginButton.setPassword(userPassword);
        testLoginButton.clickLoginButton();
        testLoginButton.visiblePersonalArea();
    }

    @Test
    @DisplayName("Can Login From Main Page")
    public void testLoginFromMainPage() {
        this.driver.get("https://stellarburgers.nomoreparties.site");
        PersonalAreaPage testLoginButton = new PersonalAreaPage(driver);
        testLoginButton.clickLoginButton();
        testLoginButton.setEmail(userEmail);
        testLoginButton.setPassword(userPassword);
        testLoginButton.clickLoginButton();
        testLoginButton.visiblePersonalArea();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
