---
title: 
---
classDiagram


class Iphone
<<Class>>Iphone
   
class ReprodutorMusical
<<Interface>>ReprodutorMusical

class AparelhoTelefonico
<<Interface>>AparelhoTelefonico

class NavegadorInternet
<<Interface>>NavegadorInternet

    Iphone --|> ReprodutorMusical

    ReprodutorMusical: +tocar() 
    ReprodutorMusical: +pausar()
    ReprodutorMusical: -selecionarMusica(String musica)


    Iphone --|> AparelhoTelefonico
    AparelhoTelefonico: -ligar(String numero) 
    AparelhoTelefonico: +atender() 
    AparelhoTelefonico: -iniciarCorreioVoz() 




    Iphone --|> NavegadorInternet
    NavegadorInternet: -exibirPagina(String url) 
    NavegadorInternet: -adicionarNovaAba() 
    NavegadorInternet: -atualizarPagina() 

    