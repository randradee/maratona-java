package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // inicialização padrão de arrays
        // char '\u0000'  ' '
        // boolean false
        // String null <- vale pra qualquer reference


        String[] nomes = new String[3];


        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
