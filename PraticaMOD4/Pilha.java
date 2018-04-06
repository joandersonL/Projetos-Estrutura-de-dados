import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> conteudo;

    public Pilha() {
        conteudo = new LinkedList<>();
    }

    public void empilha(T novoDado) {
        conteudo.addFirst(novoDado);
    }

    public void desempilha() {

    }

    public T topo() {

    }
}