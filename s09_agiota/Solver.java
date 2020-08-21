import java.util.ArrayList;
import java.util.Comparator;

class Cliente implements Comparable{
    String codenome;
    String fullname;
    private int saldo;
    public Cliente(String codenome, String fullname){
        this.codenome = codenome;
        this.fullname = fullname;
        this.saldo = 0;
    }
    void debitar(int value){
        this.saldo -= value;
    }
    void creditar(int value){
        this.saldo += value;
    }

    public String toString() {
        return "[" + codenome + ":" + saldo + "]";
    }

    public int compareTo(Cliente other){
        return this.codenome.compareTo(other.codenome);
    }
}

class Transacao {
    int id;
    String codenome;
    int valor;
    public Transacao(int id, String codenome, int valor){
        this.id = id;
        this.codenome = codenome;
        this.valor = valor;
    }
    public String toString() {
        return "[" + this.id + ":" + this.codenome + ":" + this.valor + "]";
    }
}

int comparaClientes(Cliente one, Cliente two){
    return one.codenome.compareTo(two.codenome);
}

class Agiota {
    ArrayList<Cliente> clientes;
    ArrayList<Transacao> transacoes;
    int saldo;
    int nextTrId;

    public Agiota(int saldo){
        this.saldo = saldo;
        clientes = new ArrayList<>();
        transacoes = new ArrayList<>();
        this.nextTrId = 0;
    }

    Cliente getCliente(String codenome){
        for(Cliente cliente : clientes)
            if(cliente.codenome.equals(codenome))
                return cliente;
        return null;
    }

    void addCliente(String codenome, String fullname){
        Cliente cliente = getCliente(codenome);
        if(cliente == null)
            cliente.add(new Cliente(codenome, fullname));
        Collections.sort(clientes);
    }

    
    boolean emprestar(String codenome, int valor){
        Cliente cliente = getCliente(codenome);
        if(cliente == null)
            return false;
        if(this.saldo > valor){
            cliente.creditar(saldo);
            transacoes.add(new Transacao(this.nextTrId, codenome, valor));
        }
    }

    boolean receber(codenome, valor){
        Cliente cliente = getCliente(codenome);
        if(cliente == null)
            return false;
        if(this.saldo <= valor){
            cliente.debitar(saldo);
            transacoes.add(new Transacao(this.nextTrId, codenome, -valor));
        }
    }

    boolean matar(String codenome){
        Cliente cliente = getCliente(codenome);
        if(cliente == null)
            return false;
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).codename.equals(codename)){
                contatos.remove(i);
                break;
            }
        }
        int i = 0;
        while(i < contatos.size()){
            if(transacoes.get(i).codenome.equals(codenome))
                transacoes.remove(i);
            else
                i += 1;
        }

        /*
        for(int i = contatos.size() - 1; i >= 0; i--)
            if(transacoes.get(i).codenome.equals(codenome))
                transacoes.remove(i);
        */
    }

    String getHistorico(){
        String saida = "";
        for(Transacao tr : transacoes)
            saida += tr + "\n";
        return saida;
    }

    public String toString(){
        
    }

    main(){
        Cliente one = new Cliente("albeniz", "Issac Mortenor");
        Cliente two = new Cliente("caxinha", "Zeca Rabelo");
        one < two
    }
}

/*
main(){
    add carlos oi:983 tim:234 claro:123445
    if(ui[0].equals("add")){//nome id:fone id:fone id:fone
        Contato contato = agenda.getContato(ui[1]);
        if contato == null:
            agenda.addContato(ui[1]);
        contato = agenda.getContato(ui[1]);
        for(int i = 2; i < ui.length; i++){
            String partes[] = ui[i].split(":");
            contato.addFone(partes[0], partes[1]);
        }
        //se o contato não existe
            //crio o contato
        //obtenho o contato
            //adiciona os telefones
    }
}
*/