package funcoes.reprodutorMusical;

public class SelecionarMusica implements ReprodutorMusical {

    public void selecionar(String musica) {
        System.out.println("Selecionando música ".concat(musica).concat(" via reprodutor musical"));
    }

    public void tocar() {
    }

    public void pausar() {
    }

}
