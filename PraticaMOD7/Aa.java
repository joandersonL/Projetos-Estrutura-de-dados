package projeto.pkg7;

public class Aa {

    int valor;
    int cor;
    Aa esq;
    Aa dir;
    static int R = 0;
    static int N = 1;

    public Aa(int valor, int cor, Aa esq, Aa dir) {
        this.valor = valor;
        this.cor = cor;
        this.esq = esq;
        this.dir = dir;
    }
    static String infixe(Aa a){
        String resposta="";
        if(a.esq!=null){
            resposta  += infixe(a.esq);
        }
        resposta += a.valor + " ";
        if(a.dir!=null){
            resposta+= infixe(a.dir);
        }
        return resposta;
    }
    static Aa rodeDir(Aa x){
        Aa resultado = new Aa(x.esq.valor, x.cor, x.esq.esq, 
                new Aa(x.valor,x.esq.cor,x.esq.dir,x.dir));
        return resultado;
        
        //return x;
    }
    static Aa rodeEsq(Aa x){
        Aa resultado =  new Aa(
                            x.dir.valor, 
                            R,
                            new Aa(
                                    x.valor, 
                                    N,x.esq,
                                    x.dir.esq
                            ), 
                            x.dir.dir
                        );
        resultado.dir.cor = N;
        return resultado;
    }
    
    public static void main (String [] args) {
//        Aa a = new Aa (3, N,
//        new Aa (1, N, null, null),
//        new Aa (8, R,
//        new Aa (5, N,
//        null,
//        new Aa (6, R, null, null)),
//        new Aa (9, N,
//        null,
//        new Aa (11, R, null, null))));
//        System.out.println (infixe(a
        Aa a = new Aa (4, R,
            new Aa (2, R,
            new Aa (1, N, null, null),
            new Aa (3, N, null, null)),
            new Aa (5, N, null, null));
        Fenetre x = new Fenetre(a,"aa");
        a = rodeDir(a);
        x = new Fenetre(a,"bbb");
    }
}
