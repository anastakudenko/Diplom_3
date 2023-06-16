import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConstructorPage;

public class TestClickTabs {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site");
    }

    @Test
    @DisplayName("Can CLick Filling Tab")
    public void testClickFillingTab() {
        ConstructorPage testClickTabs = new ConstructorPage(driver);
        testClickTabs.clickFillingTab();
        testClickTabs.visibleFilling();
    }

    @Test
    @DisplayName("Can CLick Bun Tab")
    public void testClickBunTab() {
        ConstructorPage testClickTabs = new ConstructorPage(driver);
        testClickTabs.clickBunTab();
        testClickTabs.visibleBun();
    }

    @Test
    @DisplayName("Can CLick Sauce Tab")
    public void testClickSauceTab() {
        ConstructorPage testClickTabs = new ConstructorPage(driver);
        testClickTabs.clickSauceTab();
        testClickTabs.visibleSauce();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
