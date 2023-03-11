import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayListTest {
    @Test
    public void meuTest(){
        PlayList play = new PlayList("First");
        int aux = play.tamanho();
        assertEquals(0, aux);
    }

    @Test
    public void adicionarMusica(){
        PlayList play = new PlayList("Secund");
        String musica = "Mozart";
        play.adicionar (musica);
        int aux = play.tamanho();
        assertEquals(1, aux);
    }

    @Test
    public void removerMusica(){
        PlayList play = new PlayList("Third");
        String musica = "Mozart";
        play.remover (musica);
        int aux = play.tamanho();
        assertEquals(0, aux);
    }

    @Test
    public void musicaExistante(){
        PlayList play = new PlayList("Fourth");
    }
}
