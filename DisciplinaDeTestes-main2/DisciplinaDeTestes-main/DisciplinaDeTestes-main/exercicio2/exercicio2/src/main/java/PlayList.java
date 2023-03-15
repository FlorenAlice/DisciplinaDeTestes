import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String nome;
    private List<String> listaMusicas;

    public PlayList(String nome){
        this.listaMusicas = new ArrayList<>();
        this.nome = nome;
    }

    public int tamanho(){
        return listaMusicas.size();
    }

    public void adicionar(String musica) {

        if (this.listaMusicas.contains(musica)){
            throw new IllegalArgumentException("Essa musica já está em sua playlist")
        }
        listaMusicas.add(musica);
    }

    public void remover(String musica){
        listaMusicas.remove(musica);
    }

}
