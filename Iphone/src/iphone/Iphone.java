package iphone;

import funcoes.aparelhoTelefonico.AparelhoTelefonico;
import funcoes.navegadorInternet.NavegadorInternet;
import funcoes.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música via Iphone");
    }

    public void pausar() {
        System.out.println("Pausando música via Iphone");
    }

    public void selecionar(String musica) {
        System.out.println("Selecionando música ".concat(musica).concat(" via Iphone "));
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página ".concat(url).concat(" via Iphone "));

    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página via Iphone");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para ".concat(numero).concat(" via Iphone "));
    }

    public void atender() {
        System.out.println("Atendendo via Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via Iphone");
    }

}
