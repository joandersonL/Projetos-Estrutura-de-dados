import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CalcRPN {

    Pilha<Double> aPilha;
    Pilha<Operacao> hist;

    CalcRPN() {
        aPilha = new Pilha<>();
        hist = new Pilha<>();
    }

    void mais() {
        double a = aPilha.desempilha();
        double b = aPilha.desempilha();
        aPilha.empilha(b + a);
        hist.empilha(new Operacao('+', a, b));
    }

    void menos() {
        double a = aPilha.desempilha();
        double b = aPilha.desempilha();
        aPilha.empilha(b - a);
        hist.empilha(new Operacao('-', a, b));
    }

    void vezes() {
        double a = aPilha.desempilha();
        double b = aPilha.desempilha();
        aPilha.empilha(b * a);
        hist.empilha(new Operacao('*', a, b));
    }

    void dividido() {
        double a = aPilha.desempilha();
        double b = aPilha.desempilha();
        aPilha.empilha(b / a);
        hist.empilha(new Operacao('/', a, b));
    }

    
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
                    cancela();
                    break;

                case "hist":
                    System.out.println(hist.toString());
                    break;

                case "clear":
                    aPilha.reinicialize();
                    hist.reinicialize();
                    break;

                default:
                    throw new Error("The operation is not valid.");
                }

        }
    }

    void cancela() {
        if (!aPilha.isEmpty()) {
            Operacao x = hist.topo();
            if (x.getCode() == 'e') {
                aPilha.desempilha();
                hist.desempilha();
            } else {
                aPilha.desempilha();
                aPilha.empilha(x.getB());
                hist.desempilha();
                aPilha.empilha(x.getA());
            }
        } else
            throw new Error("The stack is empty");
    }

    // retorna o conteudo do topo da pilha
    Double resultado() {
        if (!aPilha.isEmpty())
            return aPilha.topo();
        else
            throw new Error("The stack is empty!");
    }

    static void interfaceUsuario() throws IOException {
        CalcRPN calc = new CalcRPN();
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty())
                continue;
            for (String s : line.split(" "))
                calc.exec(s);
            System.out.println("Pilha = " + calc.aPilha);
        }
        System.out.println("Até logo");
    }

    public static void main(String[] args) throws IOException {
        interfaceUsuario();
    } 
}