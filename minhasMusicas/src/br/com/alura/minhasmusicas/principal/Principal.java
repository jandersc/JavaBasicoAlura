package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelo.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelo.Musica;
import br.com.alura.minhasmusicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Lado B Lado A");
        minhaMusica.setArtista("O Rappa");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodCast = new Podcast();
        meuPodCast.setTitulo("Pod Pah");
        meuPodCast.setHost("Igão e Mitico");

        for (int i = 0; i < 100; i++) {
            meuPodCast.reproduz();
        }

        for (int i = 0; i < 10; i++) {
            meuPodCast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodCast);
        preferidas.inclui(minhaMusica);
        
    }
}
