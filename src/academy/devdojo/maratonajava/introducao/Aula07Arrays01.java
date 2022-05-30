package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // inicialização padrão de arrays
        // char '\u0000'  ' '
        // boolean false
        // String null <- vale pra qualquer reference


        String[] nomes = new String[5];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";


        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
