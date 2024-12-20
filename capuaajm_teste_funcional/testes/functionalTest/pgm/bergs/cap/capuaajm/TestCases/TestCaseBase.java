package bergs.cap.capuaajm.TestCases;

import java.net.MalformedURLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import bergs.cap.capuaajm.Utils.DriverManager;


public class TestCaseBase {
    
    @BeforeEach
    public void inicializarDriver() throws MalformedURLException {
        DriverManager.montarCapabilitiesPadrao();
        DriverManager.iniciarDriver();
        DriverManager.definirEsperaImplicitaEmSegundos(10);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {}
    }

    @AfterEach
    void fecharDriver() {
        DriverManager.fecharDriver();
    }
}
