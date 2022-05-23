package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        // aritmético
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / (double)n2);
        System.out.println(n1 % n2);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezIgualADez " + isDezIgualADez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        // operadores lógicos: AND(&&) OR(||) NOT(!)
        int idade = 32;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPS5 = 5000;

        boolean isPS5Compravel = valorTotalContaPoupanca > valorPS5 || valorTotalContaCorrente > valorPS5;
        System.out.println("isPS5Compravel "+isPS5Compravel);

        // atribuição =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println("bonus "+bonus);
        bonus *= 2;
        System.out.println("bonus "+bonus);
        bonus -= 1000;
        System.out.println("bonus "+bonus);
        bonus /= 2;
        System.out.println("bonus "+bonus);
        bonus %= 2;
        System.out.println("bonus "+bonus);

        // ++ --
        int contador = 0;
        contador +=1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        System.out.println("contador "+contador);
    }
}
