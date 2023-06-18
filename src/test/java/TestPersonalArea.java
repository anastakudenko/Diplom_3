import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import pages.PersonalAreaPage;

public class TestPersonalArea extends BaseTest{

    @Before
    public void setUp() {
        baseSetUp();
    }

    @Test
    @DisplayName("Can't Action Personal Area Unauthorized")
    public void testPersonalAreaUnauthorized() {
        this.driver.get(baseUrl);
        PersonalAreaPage testPersonalArea = new PersonalAreaPage(driver);
        testPersonalArea.clickPersonalArea();
        testPersonalArea.visibleLoginButton();
    }

    @Test
    @DisplayName("Can Action Personal Area Authorized")
    public void testPersonalAreaAuthorized() {
        String userEmail = "testoviy@akk.com";
        String userPassword = "123456R";
        this.driver.get(baseUrl + "/register");
        PersonalAreaPage testPersonalArea = new PersonalAreaPage(driver);
        testPersonalArea.clickLoginButtonInRegistrationForm();
        testPersonalArea.setEmail(userEmail);
        testPersonalArea.setPassword(userPassword);
        testPersonalArea.clickLoginButton();
        testPersonalArea.clickPersonalArea();
        testPersonalArea.visibleProfile();
    }
}
