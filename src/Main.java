import apps.browsers.Chrome;
import apps.browsers.Mozilla;
import apps.calls.PhoneApp;
import apps.musica.Ipod;
import apps.musica.SpotifyPlayer;

public class Main {
    public static void main(String[] args) {
//         navegadores de internet
        Chrome chrome = new Chrome();
        Mozilla mozilla = new Mozilla();
//        App de ligações
        PhoneApp iphoneCalls = new PhoneApp();

        // Reprodutores de música
        Ipod ipod = new Ipod();
        SpotifyPlayer spotify = new SpotifyPlayer();

        // testes navegadores - Chrome
        chrome.exibirPagina("www.google.com");
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();

        // testes navegadores - Mozilla
        mozilla.exibirPagina("www.google.com");
        mozilla.adicionarNovaAba();
        mozilla.atualizarPagina();

        //testando ligações

        iphoneCalls.ligar("81998554515");
        iphoneCalls.atenderLigacao("87998554587");
        iphoneCalls.salvarFavoritos("87998554587");
        iphoneCalls.iniciarCorreioVoz("Correio de voz teste");

        // testando streams de musica - ipad

        ipod.selecionarMusica("Black");
        ipod.tocarMusica("black");
        ipod.pausarMusica("black");

        //testando streams de musica - spotify

        spotify.selecionarMusica("Black");
        spotify.tocarMusica("Black");
        spotify.pausarMusica("Black");
    }
}