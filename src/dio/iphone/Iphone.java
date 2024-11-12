package dio.iphone;

public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone(){
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public void tocar(){
        reprodutorMusical.tocar();
    }

    public void selecionarMusica(String string) {
        reprodutorMusical.selecionarMusica(string);
    }

    public void pausar() {
        reprodutorMusical.pausar();
    }

    public void ligar(String numero){
        aparelhoTelefonico.ligar(numero);
    }

    public void atender(){
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz(){
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void exibirPagina(String url){
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba(){
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina(){
        navegadorInternet.atualizarPagina();
    }

}
