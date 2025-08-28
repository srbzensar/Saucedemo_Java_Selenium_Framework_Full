
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver initDriver() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("resources/config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String browser = prop.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicit_wait"))));
        driver.manage().window().maximize();
        driver.get(prop.getProperty("base_url"));
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
