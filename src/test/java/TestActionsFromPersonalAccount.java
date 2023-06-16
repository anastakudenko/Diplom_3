import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConstructorPage;
import pages.PersonalAreaPage;

import java.util.concurrent.TimeUnit;

public class TestActionsFromPersonalAccount {

    private WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site/");
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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        testLogoutAccount.clickLogoutButton();
        testLogoutAccount.visibleLoginButton();
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
