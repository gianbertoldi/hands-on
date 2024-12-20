package bergs.cap.capuaajm.Tasks;

import bergs.cap.capuaajm.Pages.ContatosPage;


public class ContatosTask {
    
    private final ContatosPage contatosPage;
    
    public ContatosTask() {
        contatosPage = new ContatosPage();
    }

    public void clicarBotaoCriarNovoContato() {
        contatosPage.obterBotaoCriarNovoContato().click();
    }
}
