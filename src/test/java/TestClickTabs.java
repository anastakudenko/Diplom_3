import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import pages.ConstructorPage;

public class TestClickTabs extends BaseTest {
    @Before
    public void setUp() {
        baseSetUp();
        driver.get(baseUrl);
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
}
