import java.util.ArrayList;

public class Database{
    public static final ArrayList<Letra> caracteres;

    static{
        caracteres = new ArrayList<Letra>();
        char a = 'a';
        
        for(int i=0;i<26;i++){
           caracteres.add(new Letra(Character.toString((char) (a+i))));
        }
        char a = 'A';
        for(int i=0;i<26;i++){
           caracteres.add(new Letra(Character.toString((char) (a+i))));
        }
        char a='0';
        for(int i=0;i<10;i++){
           caracteres.add(new Letra(Character.toString((char) (a+i))));
        }
        caracteres.add(new Letra(" "));
        
    }
}
