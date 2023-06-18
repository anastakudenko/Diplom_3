import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.PersonalAreaPage;

@RunWith(Parameterized.class)
public class TestRegistration extends BaseTest{
        private final String userName;
        private final String userEmail;
        private final String userPassword;

    public TestRegistration(String userName, String userEmail, String userPassword) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{{"Настя", "kudya02@bk.ru", "123456"}, {"NASTYA", "kudyaKudya02@bk.ru", "123456Ab!"}};
    }

    @Before
    public void setUp() {
        baseSetUp();
        driver.get(baseUrl + "/register");
    }

    @Test
    @DisplayName("Can Registration")
    public void testRegistration() {
        PersonalAreaPage testRegistry = new PersonalAreaPage(driver);
        testRegistry.setName(userName);
        testRegistry.setEmail(userEmail);
        testRegistry.setPassword(userPassword);
        testRegistry.clickButtonRegistration();
        testRegistry.visibleLoginButton();
    }
}
