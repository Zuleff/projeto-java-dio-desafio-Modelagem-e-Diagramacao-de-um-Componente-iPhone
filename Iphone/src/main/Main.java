package main;

import funcoes.aparelhoTelefonico.AparelhoTelefonico;
import funcoes.aparelhoTelefonico.Atender;
import funcoes.aparelhoTelefonico.Ligar;
import funcoes.navegadorInternet.NavegadorInternet;
import funcoes.reprodutorMusical.ReprodutorMusical;
import funcoes.reprodutorMusical.Tocar;
import iphone.Iphone;

/**
 * @author luiz.vieira
 * @since 16/06
 * @version 1.0.0
 */

public class Main {
    public static void main(String[] args) throws Exception {

        AparelhoTelefonico aparelhoTelefonico = new Iphone();
        ReprodutorMusical reprodutorMusical = new Iphone();
        NavegadorInternet navegadorInternet = new Iphone();

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar("(11) 99999-9999");
        aparelhoTelefonico.iniciarCorreioVoz();

        reprodutorMusical.selecionar("Bruno Mars");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina("Google.com");

    }

}
