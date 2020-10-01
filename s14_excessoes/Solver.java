import java.util.*;

class Calculadora{
    double display;
    int battery;
    int maxBattery;

    void gastarBateria(){
        if(battery == 0)
            throw new RuntimeException("fail: bateria acabou");
        this.battery -= 1;
    }

    Calculadora(int max){
        this.maxBattery = max;
        this.battery = max;
        this.display = 0;
    }

    void charge(){
        battery += 1;
        if(this.battery > this.maxBattery)
            System.exit(1);
    }

    void soma(float x, float y){
        gastarBateria();
        this.display = x + y;
    }

    void div(float x, int y){
        gastarBateria();
        if(y == 0)
            throw new RuntimeException("fail: divisao por 0");
        this.display = x/y;
    }

    @Override
    public String toString() {
        return "" + this.display + ":" + this.battery + "/" + this.maxBattery;
    }
}

public class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora(0);
        String[] ui = new String[0];
        while(true){
            try{
                String line = scanner.nextLine();
                ui = line.split(" ");
                if(ui[0].equals("end")){
                    break;
                }else if(ui[0].equals("init")){//init _max
                    calc = new Calculadora(Integer.parseInt(ui[1]));
                }else if(ui[0].equals("show")){
                    System.out.println(calc);
                }else if(ui[0].equals("charge")){
                    calc.charge();
                }else if(ui[0].equals("soma")){//soma _x _y
                    calc.soma(Float.parseFloat(ui[1]), Float.parseFloat(ui[2]));
                }else if(ui[0].equals("div")){//soma _x _y
                    calc.div(Float.parseFloat(ui[1]), Integer.parseInt(ui[2]));
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Faltam parametros no comando " + ui[0]);
            }catch(NumberFormatException e){
                System.out.println("Voce passou um parametro errado");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}