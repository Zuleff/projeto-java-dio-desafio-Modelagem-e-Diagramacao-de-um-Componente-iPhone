package funcoes.navegadorInternet;

public class ExibirPagina implements NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("Exibindo página ".concat(url).concat(" via navegador de internet"));
    }

    public void adicionarNovaAba() {
    }

    public void atualizarPagina() {
    }

}
