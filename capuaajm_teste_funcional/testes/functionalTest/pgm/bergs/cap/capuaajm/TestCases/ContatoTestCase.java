package bergs.cap.capuaajm.TestCases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bergs.cap.capuaajm.Tasks.ContatosTask;
import bergs.cap.capuaajm.Tasks.CriarContatoTask;
import bergs.cap.capuaajm.Tasks.MenuInferiorTask;
import bergs.cap.capuaajm.Utils.Contato;
import bergs.cap.capuaajm.Utils.DriverManager;
import bergs.cap.capuaajm.VerificationPoints.ContatosVerificationPoint;


class ContatoTestCase extends TestCaseBase{

    private ContatosTask contatosTask;
    private CriarContatoTask criarContatoTask;
    private MenuInferiorTask menuInferiorTask;
    private ContatosVerificationPoint contatosVerificationPoint;
    private Contato contato;


    @BeforeEach
    void inicializarTasks() {
        contatosTask = new ContatosTask();
        menuInferiorTask = new MenuInferiorTask();
        criarContatoTask = new CriarContatoTask();
        contatosVerificationPoint = new ContatosVerificationPoint();
        contato = new Contato();
    }

    @Test
    @DisplayName("Validar criação de novo contato")
    void validarCriacaoNovoContato() {
        menuInferiorTask.clicarBotaoContatos();
        contatosTask.clicarBotaoCriarNovoContato();
        criarContatoTask.preencherCampoNome(contato.getNome());
        criarContatoTask.preencherCampoSobrenome(contato.getSobreNome());
        criarContatoTask.preencherCampoTelefone(contato.getTelefone());
        DriverManager.descerTela();
        criarContatoTask.preencherCampoEmail(contato.getEmail());
        criarContatoTask.clicarBotaoSalvar();
        contatosVerificationPoint.validarContatoFoiSalvo(contato.getNome(), contato.getSobreNome());
    }

    @Test
    @DisplayName("Validar exclusão de contato")
    void validarExclusaoContato() {

    }


    @Test
    @DisplayName("Validar edição de contato")
    void validarEdicaoContato() {
        //Steps do teste...
    }
}