public class Tamagotchi{

    void setLimpeza(int value){
        if(value > maxLimpeza)
            limpeza = maxLimpeza;
        if(value <= 0){
            limpeza = 0;
            alive = false;
            System.out.println("morreu sujinho mas feliz");
        }
    }    
}

class Jogo{
    Tamagotchi pet...
    brincar(pet){
        pet.setEnergia(pet.getEnergia() - 5);
        setLimpeza(limpeza - 10);
        setDiamonds(diamonds + 100000);
        
    }
}