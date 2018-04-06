public class CalcRPN{

    Pilha<Double> aPilha;
    Pilha<Operacao> hist;

    CalcRPN(){
        throw new Error("Must be completed");
    }

    void mais(){
        double a = aPilha.desempilha;
        double b = aPilha.desempilha;
        aPilha.empilha(b+a);
        hist.empilha(new Operacao(a,b,'+'));
    }

    void menos(){
        throw new Error("Must be completed");
    }
}