package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o número do dia da semana: ");
        int diaSemana = input.nextInt();

        String saida;

        switch(diaSemana){
            case 1:
                saida = "Domingo é final de semana";
                break;
            case 2:
                saida = "Segunda é dia útil";
                break;
            case 3:
                saida = "Terça é dia útil";
                break;
            case 4:
                saida = "Quarta é dia útil";
                break;
            case 5:
                saida = "Quinta é dia útil";
                break;
            case 6:
                saida = "Sexta é dia útil";
                break;
            case 7:
                saida = "Sábado é final de semana";
                break;
            default:
                saida = "Dia inválido";
        }
        System.out.printf(saida);
    }
}
