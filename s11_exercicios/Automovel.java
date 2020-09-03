Carro
Moto
Bicicleta

A) classes diferentes: se eles possuem comportamentos diferentes
B) objetos diferenses da mesma classe : se eles possuem valores diferentes

enum TipoDeAutomovel{
    CARRO, MOTO, BICICLETA;
}

class Automovel{
    TipoDeAutomovel tipo;// 1 carro, 2 moto, 3 bicicleta
    int maxPass;
    boolean forcaManual;
    String placa;
    public Automovel(TipoDeAutomovel tipo, String placa){
        
    }

    int getNRodas(){
        if (tipo == TipoDeAutomovel.CARRO)
            return 4;
        else if(tipo == TipoDeAutomovel.MOTO)
            return 2;
        else if(tipo == TipoDeAutomovel.BICICLETA) 
            return 2;
        else return 0;
    }
};

