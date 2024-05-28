# Desafio Iphone

Este projeto Java simula um iPhone com funcionalidades básicas de um reprodutor musical, fazer chamadas e navegação na web.

## Estrutura do Projeto

- **ReprodutorMusical**: Classe abstrata que define métodos para tocar e pausar música.
- **MeuReprodutor**: Implementação concreta da classe `ReprodutorMusical`.
- **Iphone**: Classe que utiliza um objeto de `ReprodutorMusical` para gerenciar a reprodução de música e também oferece funcionalidades para realizar chamadas e navegação na web.
- **IphoneMain**: Classe principal que demonstra o uso das funcionalidades do iPhone.

## Classes e Métodos

### ReprodutorMusical

Classe abstrata que serve como base para qualquer reprodutor musical. Ela possui métodos para tocar e pausar música, e um método abstrato `exibirInfo` que deve ser implementado por subclasses para exibir o estado atual do reprodutor.

### MeuReprodutor

Implementa a classe `ReprodutorMusical`, fornecendo uma implementação concreta do método `exibirInfo`, que exibe se a música está tocando ou pausada.

### Iphone

A classe `Iphone` possui um atributo do tipo `ReprodutorMusical` e métodos para interagir com ele. Além disso, ela contém métodos para realizar chamadas e simular funcionalidades de um navegador web. Os principais métodos são:

- **tocarSom**: Toca música usando o reprodutor musical.
- **pausarSom**: Pausa a música.
- **ligar**: Simula a realização de uma chamada.
- **selecionarFaixa**: Simula a seleção de uma faixa musical.
- **atender**: Simula atender uma chamada.
- **exibirPagina**: Simula exibir uma página web.
- **adicionarNovaAba**: Simula adicionar uma nova aba no navegador.
- **atualizarPagina**: Simula atualizar a página web atual.

### IphoneMain

A classe principal que demonstra o uso das funcionalidades da classe `Iphone`. O método `main` cria um objeto `Iphone` e chama seus métodos para tocar música, pausar música, fazer uma chamada, selecionar uma faixa, atender uma chamada e navegar na web.

## Como Executar

Para executar o projeto, compile todas as classes e execute a classe `IphoneMain`. Este é um exemplo de como você pode realizar diversas operações usando um objeto `Iphone`.

```java
package DesafioIphone;

public class IphoneMain {
    public static void main(String[] args) {
        ReprodutorMusical meuReprodutor = new MeuReprodutor();
        Iphone iphone = new Iphone(meuReprodutor);

        // Realize a execução das funções abaixo:
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