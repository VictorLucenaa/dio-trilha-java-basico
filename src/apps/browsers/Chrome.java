package apps.browsers;

import classes.NavegadorInternet;

public class Chrome implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("abrindo a página: " + url + " No Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrindo nova aba no Chrome");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página no Chrome");

    }
}
