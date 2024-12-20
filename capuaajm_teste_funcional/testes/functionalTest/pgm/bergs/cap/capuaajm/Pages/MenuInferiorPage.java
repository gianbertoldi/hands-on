package bergs.cap.capuaajm.Pages;

import org.openqa.selenium.By;

import bergs.cap.capuaajm.Utils.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MenuInferiorPage {
    
    private final AndroidDriver<MobileElement> driver;

    public MenuInferiorPage() {
        this.driver = DriverManager.obterDriver();
    }

    public MobileElement obterBotaoContatos() {
        return driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Contacts']"));
    }
}
