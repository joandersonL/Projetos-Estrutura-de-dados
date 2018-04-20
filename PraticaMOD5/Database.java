import java.util.ArrayList;

public class Database{
    public static final ArrayList<Letra> caracteres;

    static{
        caracteres = new ArrayList<Letra>();
        caracteres.add(new Letra("a"));
        caracteres.add(new Letra("b"));

        caracteres.add(new Letra("A"));
        caracteres.add(new Letra("B"));

        caracteres.add(new Letra("0"));
        
        caracteres.add(new Letra(" "));
    }
}