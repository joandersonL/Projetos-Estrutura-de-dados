import java.lang.*;
import java.security.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.logging.*;

public class SecurityProvider {

    public static String salt = "5a1t";

    public static String md5(String stringToConvert) {
        String hashtext = "";
        stringToConvert += salt;
        MessageDigest m;
        try {
            m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(stringToConvert.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            hashtext = bigInt.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SecurityProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hashtext;
    }

    public static String md5ToServer(Conta conta) {
        String cat = conta.agencia + conta.numero + conta.senha + SecurityProvider.salt;

        return md5(cat);
    }

    public static String[] md5ToClient(Conta conta) {
        String toCrypt = conta.getNomeCliente() + " " + conta.getSaldo();
        char c;
        String[] lista = new String[toCrypt.length()];
        for (int i = 0; i < toCrypt.length(); i++) {
            c = toCrypt.charAt(i);
            lista[i] = SecurityProvider.md5(String.valueOf(c));
        }
        return lista;
    }
}
