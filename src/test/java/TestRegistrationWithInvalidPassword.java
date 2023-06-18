import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.PersonalAreaPage;

@RunWith(Parameterized.class)
public class TestRegistrationWithInvalidPassword extends BaseTest {
        private final String userName;
        private final String userEmail;
        private final String userPassword;

        public TestRegistrationWithInvalidPassword(String userName, String userEmail, String userPassword) {
            this.userName = userName;
            this.userEmail = userEmail;
            this.userPassword = userPassword;
        }

        @Parameterized.Parameters
        public static Object[][] getData() {
            return new Object[][]{{"Настя", "kudya02@bk.ru", "12345"}, {"NASTYA", "kudyaKudya02@bk.ru", " "}};
        }

        @Before
        public void setUp() {
            baseSetUp();
            driver.get(baseUrl + "/register");
        }

        @Test
        @DisplayName("Can't Registration With Invalid Password")
        public void testRegistrationWithInvalidPassword() {
            String expectedAnswer = "Некорректный пароль";
            PersonalAreaPage testRegistry = new PersonalAreaPage(driver);
            testRegistry.setName(userName);
            testRegistry.setEmail(userEmail);
            testRegistry.setPassword(userPassword);
            testRegistry.clickButtonRegistration();
            testRegistry.visibleError();
            Assert.assertEquals("Текст ошибки не совпадает", testRegistry.getError(), expectedAnswer);
        }
}
