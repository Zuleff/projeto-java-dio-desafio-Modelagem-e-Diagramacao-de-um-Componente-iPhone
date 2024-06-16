package funcoes.aparelhoTelefonico;

public class Ligar implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para ".concat(numero).concat(" via aparelho telefônico"));
    }

    public void atender() {
    }

    public void iniciarCorreioVoz() {
    }

}
