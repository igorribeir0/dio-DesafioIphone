package DesafioIphone;

public class Iphone extends Telefonia implements Navegacao {
    private ReprodutorMusical reprodutor;
    int contador = 0;

    Iphone(){}

    public Iphone(ReprodutorMusical reprodutor) {
        this.reprodutor = reprodutor;
    }

    public void setReprodutor(ReprodutorMusical reprodutor) {
        this.reprodutor = reprodutor;
    }

    public void selecionarFaixa(String musicName) {
        System.out.println("Selecionando faixa: " + musicName);
    }

    void tocarSom() {
        if (reprodutor != null) {
            reprodutor.tocarMusica();
            reprodutor.infoMusica();
        } else {
            System.out.println("Nenhum reprodutor de música está configurado.");
        }
    }

    void pausarSom() {
        if (reprodutor != null) {
            reprodutor.pausarMusica();
            reprodutor.infoMusica();
        } else {
            System.out.println("Nenhum reprodutor de música está configurado.");
        }
    }


    @Override
    public void ligar(String numero) {
        String resultado = "Chamando numero: " + numero;
        System.out.println(resultado);
    }

    @Override
    public void atender(String numero) {
        String atendeer = "atendendo numero: " + numero;
        System.out.println(atendeer);
    }

    @Override
    public void correioDeVoz() {
       String mensagem = "Sua mensagem está sendo encaminhada para caixa de mensagem e estará sujeita a cobrança após o sinal";
        System.out.println(mensagem);
    }

    @Override
    public void exibirpagina(String url) {
        String acessando = "acessando a página: " + url;
        String paginas = "total de páginas: " + contador;
        System.out.println(acessando);
        System.out.println(paginas);
        contador ++;

    }

    @Override
    public void adicionarNovaAba(String url) {
        String mensagem = "Aba nova aberta " + url;
        String paginas = "total de páginas: " + contador;
        System.out.println(mensagem);
        System.out.println(paginas);
    }

    @Override
    public void atualizarPagina(String url) {
        String sistem = "A pagina " + url +" foi atualizada";
        System.out.println(sistem);
    }
}
