public class SecurityProvider {
    public static String salt = "5a1t";

public static String md5(String stringToConvert)
{String hashtext="";
stringToConvert +=salt;
MessageDigest m;
try
{
m = MessageDigest.getInstance("MD5");
m.reset();
m.update(stringToConvert.getBytes());
byte[] digest = m.digest();
BigInteger bigInt = new BigInteger(1,digest);
hashtext = bigInt.toString(16);
}
catch (NoSuchAlgorithmException ex)
{
Logger.getLogger(SecurityProvider.class.getName()).
...
log(Level.SEVERE, null, ex);
}
return hashtext;
}

public static String md5ToServer(Conta conta)
{
    return ""
}
}