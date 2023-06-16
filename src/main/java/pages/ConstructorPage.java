package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstructorPage {
    private final WebDriver driver;
    public ConstructorPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By logoBurger = By.className("AppHeader_header__logo__2D0X2");
    private final By constructor = By.xpath("//p[text()='Конструктор']");
    private final By textCollectBurger = By.xpath("//h1[text()='Соберите бургер']");
    private final By bunTab = By.xpath("//span[text()='Булки']/parent::div/parent::div");
    private final By sauceTab = By.xpath("//span[text()='Соусы']/parent::div/parent::div");
    private final By fillingTab = By.xpath("//span[text()='Начинки']/parent::div/parent::div");
    private final By textBun = By.xpath("//h2[text()='Булки']");
    private final By textSauce = By.xpath("//h2[text()='Соусы']");
    private final By textFilling = By.xpath("//h2[text()='Начинки']");

    public void clickLogoBurger() {
        driver.findElement(logoBurger).click();
    }
    public void clickConstructor() {
        driver.findElement(constructor).click();
    }

    public void visibleTextCollectBurger() {
        driver.findElement(textCollectBurger).isDisplayed();
    }

    public void clickBunTab() {
        driver.findElement(bunTab).click();
    }

    public void clickSauceTab() {
        driver.findElement(sauceTab).click();
    }

    public void clickFillingTab() {
        driver.findElement(fillingTab).click();
    }

    public void visibleBun() {
        driver.findElement(textBun).isDisplayed();
    }

    public void visibleSauce() {
        driver.findElement(textSauce).isDisplayed();
    }

    public void visibleFilling() {
        driver.findElement(textFilling).isDisplayed();
    }
}
