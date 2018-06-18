package projeto.pkg7;

import static projeto.pkg7.Aa.N;
import static projeto.pkg7.Aa.R;
import static projeto.pkg7.Aa.*;

public class Projeto7 {

//    public static void main(String[] args) {
//           Aa a = new Aa (4, R,
//            new Aa (2, R,
//            new Aa (1, N, null, null),
//            new Aa (3, N, null, null)),
//            new Aa (5, N, null, null));
//        Fenetre x = new Fenetre(a,"aa");
//        a = rodeDir(a);
//        x = new Fenetre(a,"bbb");
//        
//    }
       public static void main(String[] args) {
//            Aa a = new Aa (2, N,
//                    new Aa (1, N, null, null),
//                    new Aa (4, R,
//                        new Aa (3, N, null, null),
//                        new Aa (6, R,
//                                new Aa (5, N, null, null),
//                            new Aa (7, N, null, null))));
            
            Aa a = new Aa(10, R, null, null);
            
            a = rodeEsq(a);
            Fenetre x = new Fenetre(a,"aa");    
            x = new Fenetre(a,"bbb");
       }
}
