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
                    throw new Error("");
                }

        }
    }

    // retorna o conteudo do topo da pilha
    Double resultado() {
        throw new Error("a ser completado");
    }
}