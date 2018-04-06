public class Operacao{
    private double a,b;
    private char code;

    public Operacao(double a,double b, char code){
        this.a=a;
        this.b=b;
        this.code = code;
    }

    public Operacao(double a){
        this.a = a;
        this.code = 'e';
    }
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }
    public char getCode(){
        return code;
    }
}