import com.demoqa.configuration.ConfigProvider;
import com.demoqa.configuration.WebDriverProvider;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
@Slf4j
public abstract class BaseTest {
    protected WebDriver driver;
    @BeforeEach
    public void setUp(){
        log.info("Initialize web driver for{}", ConfigProvider.getDriverName());
        driver= WebDriverProvider.getDriver();
    }
    @AfterEach
    public void tearDown(){
        log.info("Driver has been closed");
        driver.close();
    }
}
