package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        int countDo = 0;

        do{
            System.out.println(countDo);
            countDo++;
        }while(countDo < 10);

        while(count < 10){
            System.out.println(count);
            count++;
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
