public class Letra {
    String caracteres;
    String md5Code;

    Letra(String caracteres) {

    }

    Letra getLetra(String md5){
        for(caracteres){
          if(caracteres.get(i).getMd5().equals(md5)) 
          return caracteres.get(i);
        }
        return null;
    }
}
