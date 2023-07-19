import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import pages.ConstructorPage;
import pages.PersonalAreaPage;

public class TestActionsFromPersonalAccount extends BaseTest{

    @Before
    public void setUp() {
        baseSetUp();
        driver.get(baseUrl);
        String userEmail = "testoviy@akk.com";
        String userPassword = "123456R";
        // залогин пользователя в ЛК
        PersonalAreaPage loginUser = new PersonalAreaPage(driver);
        loginUser.clickPersonalArea();
        loginUser.setEmail(userEmail);
        loginUser.setPassword(userPassword);
        loginUser.clickLoginButton();
        loginUser.clickPersonalArea();

    }
    @Test
    @DisplayName("Can CLick Constructor From Personal Area")
    public void testClickConstructor() {
        ConstructorPage testClickConstructor = new ConstructorPage(driver);
        testClickConstructor.clickConstructor();
        testClickConstructor.visibleTextCollectBurger();
    }

    @Test
    @DisplayName("Can CLick Logo Burger From Personal Area")
    public void testClickLogoBurger() {
        ConstructorPage testClickLogoBurger = new ConstructorPage(driver);
        testClickLogoBurger.clickLogoBurger();
        testClickLogoBurger.visibleTextCollectBurger();
    }

    @Test
    @DisplayName("Can Logout From Personal Area")
    public void testLogoutAccount() {
        PersonalAreaPage testLogoutAccount = new PersonalAreaPage(driver);
        testLogoutAccount.clickLogoutButton();
        testLogoutAccount.visibleLoginButton();
    }

}
