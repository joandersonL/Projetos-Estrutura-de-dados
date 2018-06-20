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
            if(i<a.valor){
                a.esq = insere(a.esq, i);
                a = rodeDir(a);
                a = rodeEsq(a);
                return a;
            }
            else{
                a.dir = insere(a.dir, i);
                a = rodeDir(a);
                a = rodeEsq(a);
                return a;
            }
           
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
    static int nivel(Aa a){
        if(a==null){
            return 0;
        }else if(a.cor==R){
            return 0 + nivel(a.esq);
        }else{
            return 1 + nivel(a.esq);
        }
        //return 0;
    }
    static boolean testSubArvoreAa(Aa a,int n, boolean podeSerVermelha){
        if(a!=null){
            if(a.cor==R && podeSerVermelha==false){
                return false;
            }else if(a.cor==R){
                return testSubArvoreAa(a.esq, n, false)&&
                        testSubArvoreAa(a.dir, n, false);
            }else{
                return testSubArvoreAa(a.esq, n-1, false)&&
                        testSubArvoreAa(a.dir, n-1, true);
            }
        }else{
            return a==null&&n==0;
        }
    }
    
    static boolean testeArvoreAa(Aa a) {
        return testSubArvoreAa(a, nivel(a), false);
    }
}
