## Autores

- [Luiz Vieira](https://github.com/Zuleff)

## POO - Desafio

### Diagrama UML (Mermaid)

```mermaid
---
title: Modelagem e Diagramação de um Componente iPhone
---
classDiagram

    class Iphone{
    }

    <<Interface>>ReprodutorMusical
    class ReprodutorMusical{
        +tocar()
        +pausar()
        -selecionarMusica(String musica)
    }

    <<Interface>>AparelhoTelefonico
    class AparelhoTelefonico{
        -ligar(String numero)
        +atender()
        -iniciarCorreioVoz()
    }

    <<Interface>>NavegadorInternet
    class NavegadorInternet{
        -exibirPagina(String url)
        -adicionarNovaAba()
        -atualizarPagina()
    }

    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet

```
