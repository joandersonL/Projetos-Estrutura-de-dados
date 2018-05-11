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
    /*
     * public static Letra getLetra(String md5){ for(caracteres){
     * if(caracteres.getCaractere(i).getMd5().equals(md5)) return
     * caracteres.getCaractere(i); } return null; }
     */
}
