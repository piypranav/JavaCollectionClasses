package EventListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class UsingEventListener {

    public static void main(String[] args) {
        SeleniumEventListeners el = new SeleniumEventListeners();
        System.setProperty("webdriver.chrome.driver", "G:\\Piyush\\Tools\\Chrome\\Chrome81.0.4044.138\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Registered Listener to Driver
        EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
        eDriver.register(el);
        driver = eDriver;

        driver.navigate().to("http://www.google.com");

    }
}
