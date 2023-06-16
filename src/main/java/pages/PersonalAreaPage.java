package pages;
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
    public void clickButtonRegistration() {
        driver.findElement(buttonRegistration).click();
    }

    public void visibleError() {
        driver.findElement(errorRegistration).isDisplayed();
    }
    public String getError() {
        return driver.findElement(errorRegistration).getText();
    }
    public void clickLoginButtonInRegistrationForm() {
        driver.findElement(buttonLoginForCheckRegistration).click();
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void visibleLoginButton() {
        driver.findElement(loginButton).isDisplayed();
    }

    public void visiblePersonalArea() {
        driver.findElement(personalArea).isDisplayed();
    }

    public void clickPersonalArea() {
        driver.findElement(personalArea).click();
    }

    public void clickRecoverPasswordButton() {
        driver.findElement(recoverPasswordButton).click();
    }

    public void visibleProfile() {
        driver.findElement(profileUser).isDisplayed();
    }

    public void clickLogoutButton() {
        driver.findElement(buttonLogout).click();
    }
}
