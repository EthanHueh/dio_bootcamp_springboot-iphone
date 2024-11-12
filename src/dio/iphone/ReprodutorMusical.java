package dio.iphone;

class ReprodutorMusical {
    private String musicaAtual;

    public void tocar(){
        if (musicaAtual != null){
            System.out.println("Tocando \""+musicaAtual+"\"");
        }
    }

    public void pausar(){
        if (musicaAtual != null){
            System.out.println("Pausando \""+musicaAtual+"\"");
        }
    }

    public void selecionarMusica(String musica){
        musicaAtual = musica;
        System.out.println("Musica \""+musicaAtual+"\" selecionada");
    }

}
