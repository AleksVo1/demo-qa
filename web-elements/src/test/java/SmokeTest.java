import com.demoqa.configuration.ConfigProvider;
import org.junit.jupiter.api.Test;

public class SmokeTest extends BaseTest{
    @Test
    public void smokeTest(){
        driver.get(ConfigProvider.BASE_URL);
    }
}
