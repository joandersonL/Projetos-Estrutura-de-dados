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
        if(x.esq==null || x.esq.cor!=R){
            return x;
        }
        Aa resultado = new Aa(x.esq.valor, x.cor, x.esq.esq, 
                new Aa(x.valor,x.esq.cor,x.esq.dir,x.dir));
        return resultado;
        
        //return x;
    }
    static Aa rodeEsq(Aa x){
        if(x.dir==null){
            return x;
        }else if(x.dir.dir==null){
            return x;
        }else if(x.dir.cor!=R){
            return x;
        }else if(x.dir.dir.cor!=R){
            return x;
        }
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
    static Aa insere(Aa a,int i){
       if(a==null){
           a = new Aa(i, R, null, null);
           return a;
       }else{
                a.esq = insere(a.esq, i);
                a = rodeDir(a);
                a = rodeEsq(a);
                return a;
           
       }
      
        
        //return null;
    }
    static Aa insereECorrigeRaiz(Aa a,int i){
        a = insere(a,i);
        if(a.cor==R){
            a.cor = N;
        }
        return a;
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
    }
}
