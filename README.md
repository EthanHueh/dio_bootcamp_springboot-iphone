# DESAFIO DE PROJETO - DIO
## Modelagem e Diagramação de um Componente Iphone

Projeto para entrega de desafio de projeto no Bootcamp de Springboot da DIO (Digital Innovation One).

Nesse projeto fiz uma implementação simples em Java, onde chamo os métodos do Iphone que realizam uma saída no terminal/console.

### Modelagem do Componente Iphone

```mermaid
classDiagram
    class ReprodutorMusical {
        musicaAtual: String
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        exibirPagina(String url)
        adicionarNovaAba()
        atualizarPagina()
    }

    class iPhone {
        
    }

    iPhone --* ReprodutorMusical
    iPhone --* AparelhoTelefonico
    iPhone --* NavegadorInternet
```
