package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // valorParcela >= 1000
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o valor do carro: ");
        int valorCarro = input.nextInt();
        int valorParcela = 1000;
        int parcelas = 0;

        if (valorCarro < valorParcela){
            System.out.println("Valor inválido");
        }else {
            for (int i = 0; i < 1_000_1000; i+=valorParcela) {
                if(i >= valorCarro){
                    break;
                }
                parcelas++;
            }
        }
        System.out.println("O carro pode ser parcelado em "+parcelas+" vezes.");
    }
}
