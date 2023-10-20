package apps.musica;

import classes.ReprodutorMusical;

public class SpotifyPlayer extends ReprodutorMusical {
    @Override
    public void tocarMusica(String musicaTocando) {
        System.out.println("Tocando a música: " + musicaTocando + " no Spotify");
    }

    @Override
    public void pausarMusica(String musicaPausada){
        System.out.println("Pausando a música " + musicaPausada + " no Spotify");
    }

    @Override
    public void selecionarMusica(String musicaSelecionada) {
        System.out.println("Iniciando a música: " + musicaSelecionada + " no Spotify");
    }
}
