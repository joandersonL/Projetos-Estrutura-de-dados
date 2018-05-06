public class Letra {
    private String caractere, md5Code;

    Letra(String caractere) {
        this.caractere = caractere;
        this.md5Code = SecurityProvider.md5(caractere);
    }

    public String getCaractere() {
        return caractere;
    }

    public String getMd5Code() {
        return md5Code;
    }

    /*
     * public static Letra getLetra(String md5){ for(caracteres){
     * if(caracteres.getCaractere(i).getMd5().equals(md5)) return
     * caracteres.getCaractere(i); } return null; }
     */
    public static void test6() {
        Letra l = new Letra("a");
        String md5 = l.getMd5Code();
        System.out.println(md5);
    }

    public static void main(String[] args) {
        test6();
    }
}