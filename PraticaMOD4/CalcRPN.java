public class CalcRPN {

    Pilha<Double> aPilha;
    Pilha<Operacao> hist;

    CalcRPN() {
        aPilha = new Pilha<>();
        hist = new Pilha<>();
    }

    void mais() {
        double a = aPilha.desempilha;
        double b = aPilha.desempilha;
        aPilha.empilha(b + a);
        hist.empilha(new Operacao(a, b, '+'));
    }

    void menos() {
        double a = aPilha.desempilha;
        double b = aPilha.desempilha;
        aPilha.empilha(b - a);
        hist.empilha(new Operacao(a, b, '-'));
    }

    void vezes() {
        double a = aPilha.desempilha;
        double b = aPilha.desempilha;
        aPilha.empilha(b * a);
        hist.empilha(new Operacao(a, b, '*'));
    }

    void dividido() {
        double a = aPilha.desempilha;
        double b = aPilha.desempilha;
        aPilha.empilha(b / a);
        hist.empilha(new Operacao(a, b, '/'));
    }

    // interpretador de comandos
    void exec(String cmd) {
        double valor;

        try {
            valor = (Double.parseDouble(cmd));
            aPilha.empilha(valor);
            hist.empilha(new Operacao(valor));

        } catch (NumberFormatException e) {
            if (null == cmd) {
                throw new Error("");

            } else
                switch (cmd) {
                case "+":
                    mais();
                    break;

                case "-":
                    menos();
                    break;

                case "*":
                    vezes();
                    break;

                case "/":
                    dividido();
                    break;

                case "undo":
                    break;

                default:
                    throw new Error("The operation is not valid.");
                }

        }
    }

    void undo() {

        Operacao x = hist.desempilha();

        if (x != NULL) {
            if (x.getCode() == 'e') {
                aPilha.desempilha();
            } else {
                aPilha.desempilha();             
                aPilha.empilha(x.getB());
                aPilha.empilha(x.getA()); 
            }
        }
        else
            throw new Error("The stack is empty");
    }

    // retorna o conteudo do topo da pilha
    Double resultado() {
        return aPilha.topo();
    }
}