package apps.calls;

import classes.AparelhoTelefonico;

public class PhoneApp implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero);
    }

    @Override
    public void atenderLigacao(String numero) {
        System.out.println("Recebendo ligação de: " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem) {
        System.out.println("Mensagem do correio de voz: " + mensagem);
    }

    @Override
    public void salvarFavoritos(String numero) {
        System.out.println("Salvando " + numero + " como favorito nos contatos");
    }
}
