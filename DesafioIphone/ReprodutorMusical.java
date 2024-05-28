package DesafioIphone;

public abstract class ReprodutorMusical {
    boolean musica;
    String musicName;

    public ReprodutorMusical () {
        this.musica = false;
    }

    boolean tocarMusica() {
        return musica = true;
    }

    boolean pausarMusica() {
        musica = false;
        return musica;
    }


    public void infoMusica() {
        System.out.println("Reprodutor de música: " + (musica ? "Tocando" : "Pausado"));
    }


    public void selecionarFaixa(String musicName) {
        System.out.println("Selecionando faixa: " + musicName);
    }

    //public void exibirInfo() {
    //        System.out.println("Reprodutor de música: " + (musica ? "Tocando" : "Pausado"));
    //    }

}
