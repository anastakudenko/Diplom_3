import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PersonalAreaPage;

import java.util.concurrent.TimeUnit;

public class TestPersonalArea {

    private WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    @DisplayName("Can't Action Personal Area Unauthorized")
    public void testPersonalAreaUnauthorized() {
        this.driver.get("https://stellarburgers.nomoreparties.site");
        PersonalAreaPage testPersonalArea = new PersonalAreaPage(driver);
        testPersonalArea.clickPersonalArea();
        testPersonalArea.visibleLoginButton();
    }

    @Test
    @DisplayName("Can Action Personal Area Authorized")
    public void testPersonalAreaAuthorized() {
        String userEmail = "testoviy@akk.com";
        String userPassword = "123456R";
        this.driver.get("https://stellarburgers.nomoreparties.site/register");
        PersonalAreaPage testPersonalArea = new PersonalAreaPage(driver);
        testPersonalArea.clickLoginButtonInRegistrationForm();
        testPersonalArea.setEmail(userEmail);
        testPersonalArea.setPassword(userPassword);
        testPersonalArea.clickLoginButton();
        testPersonalArea.clickPersonalArea();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        testPersonalArea.visibleProfile();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
