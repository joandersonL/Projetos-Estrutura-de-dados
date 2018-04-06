public class CalcRPN {

    Pilha<Double> aPilha;
    Pilha<Operacao> hist;

    CalcRPN() {
        throw new Error("Must be completed");
    }

    void mais() {
        double a = aPilha.desempilha;
        double b = aPilha.desempilha;
        aPilha.empilha(b + a);
        hist.empilha(new Operacao(a, b, '+'));
    }

    void menos() {
        throw new Error("Must be completed");
    }

    void vezes() {
        throw new Error("a ser completado");
    }

    void dividido() {
        throw new Error("a ser completado");
    }

    // retorna o conteudo do topo da pilha
    Double resultado() {
        throw new Error("a ser completado");
        }
    // interpretador de comandosvoid exec(String cmd) {
    throw new Error("a ser completado");
}}}