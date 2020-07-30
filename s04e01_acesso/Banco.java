class Operacao(){
    Operacao(id, descricao, valor, saldo)
}

class Conta{
    private float saldo;
    private String id;

    public String getId(){
        return id;
    }
    public void setId(String value){
        if(value.contains(" ")){
            System.out.println("Id invalido, nao use ESPACO");
            return;
        }
        this.id = value;
    }
    public float getSaldo(){
        return saldo;
    }

    private void addOpe(nome, value){
        operacoes.add(new Operacao(nextId, nome, value, saldo))
        nextId += 1;
    }

    public void creditar(float value){
        System.out.println("Eba, recebendo dinheiro");
        saldo += value;
        this.addOpe("credito", 5);
    }
    public void debitar(float value){
        if(value > this.saldo){
            System.out.println("fundos insuficientes");
            return;
        }
        System.out.println("Egua, tirando dinheiro pro PACCEI");
        saldo -= value;
        this.addOpe("debito", -5);
  }
}

public class Banco{
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo -=
        conta.getSaldo();
    }
}