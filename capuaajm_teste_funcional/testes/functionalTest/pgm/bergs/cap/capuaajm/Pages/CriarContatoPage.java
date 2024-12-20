package bergs.cap.capuaajm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bergs.cap.capuaajm.Utils.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CriarContatoPage {
    
    private final AndroidDriver<MobileElement> driver;

    public CriarContatoPage() {
        this.driver = DriverManager.obterDriver();
    }

    public WebElement obterCampoNome() {
        return this.driver.findElement(By.xpath("//android.widget.EditText[@text='First name']"));
    }

    public WebElement obterCampoSobrenome() {
        return driver.findElement(By.xpath("//android.widget.EditText[@text='Last name']"));
    }

    public WebElement obterCampoTelefone() {
        return driver.findElement(By.xpath("//android.widget.EditText[@text='Phone']"));
    }

    public WebElement obterListaTipoTelefone() {
        return driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='Mobile Phone']"));
    }

    public WebElement obterCampoEmail() {
        return driver.findElement(By.xpath("//android.widget.EditText[@text='Email']"));
    }

    public WebElement obterBotaoSalvar() {
        return driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.google.android.contacts:id/menu_save']/android.widget.Button[@resource-id='com.google.android.contacts:id/toolbar_button']"));
    }
}
