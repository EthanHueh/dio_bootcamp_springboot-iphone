package dio;

import dio.iphone.Iphone;

public class ApresentacaoIphone {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        System.out.println("------ Apresentação do Iphone ------");
        
        System.out.println("\n1. Reprodutor Musical:");
        iphone.selecionarMusica("Beatles - Hey Jude");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Justin Bieber - Baby");
        iphone.tocar();

        System.out.println("\n2. Aparelho Telefônico:");
        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n3. Navegador Internet:");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
    }
    
}
