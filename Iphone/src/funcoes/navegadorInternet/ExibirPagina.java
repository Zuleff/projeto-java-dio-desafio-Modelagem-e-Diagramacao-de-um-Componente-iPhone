package funcoes.navegadorInternet;

public abstract class ExibirPagina implements NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("Exibindo página ".concat(url).concat(" via navegador de internet"));
    }

}
