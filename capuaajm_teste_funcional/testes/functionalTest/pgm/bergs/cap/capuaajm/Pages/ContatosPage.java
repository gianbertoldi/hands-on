package bergs.cap.capuaajm.Pages;

import java.util.List;

import org.openqa.selenium.By;

import bergs.cap.capuaajm.Utils.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ContatosPage {
    
    private final AndroidDriver<MobileElement> driver;

    public ContatosPage() {
        this.driver = DriverManager.obterDriver();
    }

    public MobileElement obterBotaoCriarNovoContato() {
        return driver.findElement(By.xpath("//android.widget.TextView[@text='Create new contact']"));
    }

    public List<MobileElement> obterListaContatos() {
        return driver.findElements(By.id("contact_name"));
    }
}
