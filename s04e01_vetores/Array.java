import java.util.ArrayList;

class Array{
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<>();
        vetor.add(0);
        vetor.add(1);
        vetor.add(2);
        vetor.add(0, 3); //insert indice
        vetor.add(2, 9);
        vetor.add(0);
        vetor.remove(Integer.valueOf(2));
        vetor.remove(3);

        System.out.println(vetor.contains(9));
        vetor.set(0, 99);

        //laço indexado
        for(int i = 0; i < vetor.size(); i++){
            System.out.print(vetor.get(i) + " ");
        } 
        System.out.println("");

        //for range
        for(Integer value : vetor)
            System.out.print(value + " ");
        System.out.println("");

        System.out.println(vetor);
    }
}