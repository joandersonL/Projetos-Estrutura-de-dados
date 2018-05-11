import java.util.ArrayList;

public class Database {
    public static final ArrayList<Letra> caracteres;

    static {
        caracteres = new ArrayList<Letra>();
        char a = 'a';

        for (int i = 0; i < 26; i++) {
            caracteres.add(new Letra(Character.toString((char) (a + i))));
        }
        a = 'A';
        for (int i = 0; i < 26; i++) {
            caracteres.add(new Letra(Character.toString((char) (a + i))));
        }
        a = '0';
        for (int i = 0; i < 10; i++) {
            caracteres.add(new Letra(Character.toString((char) (a + i))));
        }
        caracteres.add(new Letra(" "));
    }
        public static Letra getLetra(String md5){
        for(int i=0;i<caracteres.size();i++){
            if(caracteres.get(i).getMd5Code().equals(md5)){
                return caracteres.get(i);
            }
        }
        return null;
     }
    public static Conta getConta(String s[]){
        Conta c = null;
        String nome = "";
        String saldo= "";
        boolean flag = true;
        for (String item : s) {
            
            String a = getLetra(item).getCaractere();
            if(a.charAt(0)>='0'&&a.charAt(0)<='9'){
                saldo += a;
            }else{
                nome += a;
            }
            
        }
        c = new Conta(nome,saldo);
        //c.setSaldo(saldo);
        return c;
        
    }
    }

