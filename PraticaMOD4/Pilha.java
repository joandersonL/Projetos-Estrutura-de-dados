import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> conteudo;

    public Pilha() {
        conteudo = new LinkedList<>();
    }

    public void empilha(T novoDado) {
        conteudo.addFirst(novoDado);
    }

    public T desempilha() {
        return conteudo.removeFirst();
    }

    public T topo() {
        return conteudo.getFirst();
    }

    public String toString() {
        return conteudo.toString();
    }

    public boolean isEmpty() {
        return conteudo.isEmpty();
    }

    public void reinicialize() {
        while (!conteudo.isEmpty())
            conteudo.pop();
    }

    public String toStringInverse() {
        //retornar pilha na ordem inversa
        inversa = new LinkedList<>();

        inversa.addFirst(conteudo.getFirst());

        while (conteudo.getLast() != NULL)
        
           

        return inversa.toString();
    }

    static void test1() {
        Pilha<Double> aPilha = new Pilha<Double>();
        aPilha.empilha(1.1);
        aPilha.empilha(2.1);
        aPilha.empilha(3.1);
        aPilha.empilha(4.1);
        aPilha.empilha(5.1);
        double valor = 0.0;
        valor = aPilha.topo();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.topo();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
    }

    static void test2() {
        Pilha<Double> aPilha = new Pilha<Double>();
        System.out.println(aPilha);
        aPilha.empilha(1.1);
        System.out.println(aPilha);
        aPilha.empilha(2.1);
        System.out.println(aPilha);
        aPilha.empilha(3.1);
        System.out.println(aPilha);
        double valor = 0.0;
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        System.out.println(aPilha);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        System.out.println(aPilha);

        /* valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        System.out.println(aPilha); */

        aPilha.reinicialize();
        System.out.println(aPilha);
    }

    public static void main(String[] args) {
        test1();
        test2();
    }
}