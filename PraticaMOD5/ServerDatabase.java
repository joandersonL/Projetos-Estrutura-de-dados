public class ServerDatabase extends Database {
    public static final ArrayList<ArrayList<Conta>> contas;
    public static final int N = 100;
    static {
        contas = new ArrayList<ArrayList<Conta>>();
        for (int i = 0; i < N; i++) {
            contas.add(new ArrayList<Conta>());
        }
    }
}