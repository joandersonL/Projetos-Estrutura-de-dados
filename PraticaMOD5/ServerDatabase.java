public class ServerDatabase extends Database {
    public static final ArrayList<ArrayList<Conta>> contas;
    public static final int N = 100;
    static {
        contas = new ArrayList<ArrayList<Conta>>();
        for (int i = 0; i < N; i++) {
            contas.add(new ArrayList<Conta>());
        }
    }

    public static int hashCode(String md5) {
        BigInteger bi = new BigInteger(md5, 16);
        BigInteger m = new BigInteger(Integer.toString(N), 10);
        int pos;
        pos = bi.mod(m).intValue();
        return pos;
    }

    public static void insereConta(Conta conta)
    {

    string md5 = SecurityProvider.md5ToServer(conta);
    int indice = hashCode(md5);
    ArrayList<Conta> posicao = contas.get(indice);
    lista.add(conta);

    for(i = 0 ;i<lista.size();i++){
        if(lista.get(conta))
    }

    public static Conta getConta(String md5) {
    }
    }
}