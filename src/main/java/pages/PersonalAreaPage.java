package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAreaPage {
    private final WebDriver driver;
    public PersonalAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By fieldName = By.xpath("//label[text()='Имя']//following-sibling::input");
    private final By fieldEmail = By.xpath("//label[text()='Email']//following-sibling::input");
    private final By fieldPassword = By.name("Пароль");
    private final By buttonRegistration = By.xpath("//button[text()='Зарегистрироваться']");
    private final By buttonLoginForCheckRegistration = By.xpath("//a[text()='Войти']");
    private final By errorRegistration = By.className("input__error");
    private final By loginButton = By.className("button_button__33qZ0");
    private final By personalArea = By.xpath("//p[text()='Личный Кабинет']");
    private final By recoverPasswordButton = By.xpath("//a[text()='Восстановить пароль']");
    private final By profileUser = By.xpath("//a[text()='Профиль']");
    private final By buttonLogout = By.xpath("//button[text()='Выход']");

    public void setName(String userName) {
        driver.findElement(fieldName).sendKeys(userName);
    }

    public void setEmail(String userEmail) {
        driver.findElement(fieldEmail).sendKeys(userEmail);
    }
    public void setPassword(String userPassword) {
        System.out.println(driver.findElement(fieldPassword));
        driver.findElement(fieldPassword).sendKeys(userPassword);
    }
    @Step("Клик по по кнопке регистрации")
    public void clickButtonRegistration() {
        driver.findElement(buttonRegistration).click();
    }
    @Step("Проверка видимости ошибки")
    public void visibleError() {
        driver.findElement(errorRegistration).isDisplayed();
    }
    @Step("Получение текста ошибки")
    public String getError() {
        return driver.findElement(errorRegistration).getText();
    }
    @Step("Клик по кнопке Войти на странице регистрации")
    public void clickLoginButtonInRegistrationForm() {
        driver.findElement(buttonLoginForCheckRegistration).click();
    }
    @Step("Клик по кнопке Войти")
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    @Step("Проверка видимости кнопки Войти")
    public void visibleLoginButton() {
        driver.findElement(loginButton).isDisplayed();
    }

    @Step("Проверка видимости кнопки Личный кабинет")
    public void visiblePersonalArea() {
        driver.findElement(personalArea).isDisplayed();
    }

    @Step("Клик по по кнопке Личного кабинета")
    public void clickPersonalArea() {
        driver.findElement(personalArea).click();
    }
    @Step("Клик по по кнопке восстановления аккаунта")
    public void clickRecoverPasswordButton() {
        driver.findElement(recoverPasswordButton).click();
    }
    public void visibleProfile() {
        driver.findElement(profileUser).isDisplayed();
    }
    @Step("Клик по по выхода из аккаунта")
    public void clickLogoutButton() {
        driver.findElement(buttonLogout).click();
    }
}
