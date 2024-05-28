package DesafioIphone;

public class MeuReprodutor extends ReprodutorMusical{


    @Override
    public void infoMusica() {
        System.out.println("Reprodutor de música: " + (musica ? "Tocando" : "Pausado"));
    }

    @Override
    public void selecionarFaixa(String musicName) {
        System.out.println("Selecionando faixa: " + musicName);
    }
}
