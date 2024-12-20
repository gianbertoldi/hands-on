package bergs.cap.capuaajm.VerificationPoints;

import org.junit.jupiter.api.Assertions;

import bergs.cap.capuaajm.Pages.ContatosPage;
import io.appium.java_client.MobileElement;


public class ContatosVerificationPoint {

    private final ContatosPage contatosPage;

    public ContatosVerificationPoint() {
        contatosPage = new ContatosPage();
    }

    public void validarContatoFoiSalvo(String nome, String sobrenome) {
        boolean nomeEstaNaListaDeContatos = false;
        for(MobileElement elementoNome : contatosPage.obterListaContatos()) {
            if (elementoNome.getText().equals(nome + " " + sobrenome)) {
                nomeEstaNaListaDeContatos = true;
                break;
            }
        }
        Assertions.assertTrue(nomeEstaNaListaDeContatos);
    }
}
