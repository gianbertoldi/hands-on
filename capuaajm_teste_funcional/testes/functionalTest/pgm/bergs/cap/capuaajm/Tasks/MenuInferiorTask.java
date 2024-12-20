package bergs.cap.capuaajm.Tasks;

import bergs.cap.capuaajm.Pages.MenuInferiorPage;


public class MenuInferiorTask {
    
    private final MenuInferiorPage menuInferiorPage;
    
    public MenuInferiorTask() {
        menuInferiorPage = new MenuInferiorPage();
    }

    public void clicarBotaoContatos() {
        menuInferiorPage.obterBotaoContatos().click();
    }
}
