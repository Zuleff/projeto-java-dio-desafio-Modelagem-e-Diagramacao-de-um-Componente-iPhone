package funcoes.reprodutorMusical;

public abstract class SelecionarMusica implements ReprodutorMusical {

    public void selecionar(String musica) {
        System.out.println("Selecionando música ".concat(musica).concat(" via reprodutor musical"));
    }

}
