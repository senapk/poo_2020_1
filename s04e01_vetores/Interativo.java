import java.util.Scanner;
import java.util.ArrayList;

public class Interativo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vet = new ArrayList<>();
        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("add")){//value
                for(int i = 1; i < ui.length; i += 1)
                    vet.add(Integer.parseInt(ui[i]));
            }else if(ui[0].equals("insert")){//pos value
                int pos = Integer.parseInt(ui[1]);
                int value = Integer.parseInt(ui[2]);
                vet.add(pos, value);
            }else if(ui[0].equals("show")){
                System.out.println(vet);
            }else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}