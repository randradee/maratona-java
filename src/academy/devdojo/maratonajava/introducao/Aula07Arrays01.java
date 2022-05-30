package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // inicialização padrão de arrays
        // char '\u0000'  ' '
        // boolean false
        // String null <- vale pra qualquer reference

        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for(int numero: numeros3){
            System.out.println(numero);
        }

    }
}
