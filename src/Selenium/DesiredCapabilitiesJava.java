package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesJava {

    public void setDesiredCapabilities() {
        System.setProperty("webdriver.chrome.driver", "");
        WebDriverManager.chromedriver().setup();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        WebDriver driver = new ChromeDriver(options);

    }

    public static void main(String[] args) {

    }
}
