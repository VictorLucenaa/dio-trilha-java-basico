package apps.browsers;

import classes.NavegadorInternet;

public class Mozilla implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo nova página: " + url + " No Mozilla");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrindo nova aba no Mozilla");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página no Mozilla");

    }
}
