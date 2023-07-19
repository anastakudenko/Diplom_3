import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    String baseUrl = "https://stellarburgers.nomoreparties.site";
    public void baseSetUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

