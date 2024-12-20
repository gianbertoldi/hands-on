package bergs.cap.capuaajm.Tasks;

import bergs.cap.capuaajm.Pages.CriarContatoPage;


public class CriarContatoTask {
    
    private final CriarContatoPage criarContatoPage;

    public CriarContatoTask() {
        criarContatoPage = new CriarContatoPage();
    }

    public void preencherCampoNome(String nome) {
        criarContatoPage.obterCampoNome().sendKeys(nome);
    }

    public void preencherCampoSobrenome(String sobrenome) {
        criarContatoPage.obterCampoSobrenome().sendKeys(sobrenome);
    }

    public void preencherCampoTelefone(String telefone) {
        criarContatoPage.obterCampoTelefone().sendKeys(telefone);
    }

    public void abrirListaTipoTelefone() {
        criarContatoPage.obterListaTipoTelefone().click();
    }

    public void selecionarTipoTelefone(String tipoTelefone) {
        criarContatoPage.obterListaTipoTelefone().sendKeys(tipoTelefone);
    }

    public void preencherCampoEmail(String email) {
        criarContatoPage.obterCampoEmail().sendKeys(email);
    }

    public void clicarBotaoSalvar() {
        criarContatoPage.obterBotaoSalvar().click();
        try {
            Thread.sleep(1000);
        } catch(Exception ignored) {}
    }
}
