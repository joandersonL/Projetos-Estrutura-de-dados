package algoritimos.de.ordenacao;

public class Quicksort {
    static void swap(int[] a,int i,int j){
        int x = a[i];
        a[i]=a[j];
        a[j]=x;
                
    }
    static int partition(int[] v, int inicio, int fim) {
 
        int pivo = v[inicio];
        int i=inicio +1;
        int j = fim;
        if(fim-inicio==1){
            
            if(v[inicio]>v[fim]){
                swap(v,inicio,fim);
                return fim;
            }
        
            return inicio;
        }
        while(i<j){
            while(i<=fim&&v[i]<pivo)i++;
            while(j>inicio && v[j]>=pivo)j--;
            if(i>j){
                swap(v,inicio,j);
                return j;
            }else{
                swap(v,i,j);
            }
        }
        return 0;
    }
    static void quickrec(int[] v, int inicio, int fim) {
        int x= inicio;
        if(inicio<fim&&fim<v.length){
            x = partition(v,inicio,fim);
        }
        if(inicio<(x-1) && (x-1)<v.length){
            quickrec(v,inicio,x-1);
        }
        if((x+1)<fim&& fim<v.length){
            quickrec(v,x+1,fim);
        }
    }

    static void quicksort(int[] v) {
       quickrec(v,0,v.length-1);
    }
}
