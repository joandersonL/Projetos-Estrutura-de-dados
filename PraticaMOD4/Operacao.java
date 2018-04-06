public class Operacao {
    private double a, b;
    private char code;

    public Operacao(char code, double a, double b) {
        this.a = a;
        this.b = b;
        this.code = code;
    }

    public Operacao(double a) {
        this.a = a;
        this.code = 'e';
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public char getCode() {
        return code;
    }
    public String toString(){
        if(code == 'e')
        return ; //retornar a
        else
        return ; //retornar code
    }


public static void main (String[] args) {
    Operacao[] op = new Operacao[9];
    op[0] = new Operacao(16.0);
    op[1] = new Operacao(8.0);
    op[2] = new Operacao(4.0);
    op[3] = new Operacao(2.0);
    op[4] = new Operacao(1.0);
    op[5] = new Operacao('+', 2.0, 1.0);
    op[6] = new Operacao('-', 4.0, 3.0);
    op[7] = new Operacao('*', 8.0, 1.0);
    op[8] = new Operacao('/', 16.0, 8.0);
    for (int i=0; i<op.length; i++){
    System.out.print(op[i] + "  ");
    System.out.println();
    }
}}