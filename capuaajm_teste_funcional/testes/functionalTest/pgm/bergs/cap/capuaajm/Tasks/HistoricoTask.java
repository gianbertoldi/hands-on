package bergs.cap.capuaajm.Tasks;

import bergs.cap.capuaajm.Pages.ContatosPage;


public class HistoricoTask {
    
    private final ContatosPage contatosPage;
    
    public HistoricoTask() {
        contatosPage = new ContatosPage();
    }

    public void clicarBotaoCriarNovoContato() {
        contatosPage.obterBotaoCriarNovoContato().click();
    }
}
