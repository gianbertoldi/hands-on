package bergs.cap.capuaajm.Utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
    private static AndroidDriver<MobileElement> driver;
    private static DesiredCapabilities options;

    private DriverManager() {}

    public static void montarCapabilitiesPadrao() {
        options = new DesiredCapabilities();
        options.setCapability("udid", "emulator-5554");
        options.setCapability("appPackage", "com.google.android.dialer");
        options.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
        options.setCapability("platformName", "Android");
        options.setCapability("deviceName", "Emulator");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("chromedriverExecutable", "\\\\n712\\pxh\\Soft\\BTH\\BIN\\selenium\\drivers\\chromedriver\\74.0\\chromedriver.exe");
        options.setCapability("chromedriverVersion", "");
        options.setCapability("noSign", true);

        ChromeOptions chromeOptions = new ChromeOptions(); 
        chromeOptions.setExperimentalOption("w3c", false); 
        chromeOptions.setCapability("browserName", "");
        options.merge(chromeOptions);
    }

    public static void iniciarDriver() throws MalformedURLException {
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), options);
        
    }

    public static AndroidDriver<MobileElement> obterDriver() {
        return driver;
    }

    public static void fecharDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void definirEsperaImplicitaEmSegundos(int tempoDeEspera) {
        driver.manage().timeouts().implicitlyWait(tempoDeEspera, TimeUnit.SECONDS);
    }
    
    public static void descerTela() {
        Dimension windowSize = driver.manage().window().getSize();
        
        driver.executeScript(
                "mobile: swipeGesture", 
                Map.of(
                    "left", windowSize.getWidth() / 2, 
                    "top", windowSize.getWidth() / 3, 
                    "width", 50,
                    "height", 1000,
                    "direction", "up",
                    "percent", 1.0,
                    "speed", 1000
                )
        );
    }
}
