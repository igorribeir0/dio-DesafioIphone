package DesafioIphone;

public class IphoneMain {
    public static void main(String[] args) {
        ReprodutorMusical meuReprodutor = new MeuReprodutor();
        Iphone iphone = new Iphone(meuReprodutor);

        // Realize a execução das funções abaixo:
        // Exemplo: iphone.correioDeVoz();
        iphone.tocarSom();
        iphone.pausarSom();
        iphone.selecionarFaixa("Stand by me");
        iphone.atender("123-456-7890");
        iphone.ligar("123-456-7890");
        iphone.exibirpagina("google.com");
        iphone.adicionarNovaAba("youtube.com");
        iphone.atualizarPagina("youtube.com");



    }
}
