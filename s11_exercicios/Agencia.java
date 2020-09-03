// class Operacao
// + indice: int
// + descricao: string
// + valor: float
// + saldo: float
// --
// + Operacao(indice, descricao, valor, saldo)

class Operacao{
    int indice;
    String descricao;
    int valor;
    int saldo;
}

class Conta {
    int nextId;
    int saldo;
    String numero;
    ArrayList<Operacao> extrato;

    private void addOperacao(String label, int value){
        saldo += value;
        Operacao operacao = new Operacao(nextId, label, value, saldo);
        nextId += 1;
        extrato.add(operacao);
    }

    int debito(int value){
        if saldo < value:
            imprime erro e sai
        addOperacao("saque", -value);
    }

    int credito(int value){
        if value < 0:
            imprime erro e sai
        addOperacao("credito", value);
    }

}
