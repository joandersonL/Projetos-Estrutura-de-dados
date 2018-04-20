public static void insereConta(Conta conta)
{

    string md5 = SecurityProvider.md5ToServer(conta);
    int indice = hashCode(md5);
    ArrayList<Conta> posicao = contas.get(indice);
    lista.add(conta);

    for(i = 0 ;i<lista.size();i++){
        if(lista.get(conta))
    }
}