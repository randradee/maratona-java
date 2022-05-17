package academy.devdojo.maratonajava.introducao;

import java.nio.charset.StandardCharsets;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = (int)10000000000000L;
        short idadeShort = 10;
        long numeroGrande = 100000;
        float salarioFloat = (float)2500D;
        double salarioDouble = 2000;
        byte idadeByte = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "Renato";
        System.out.println(nome);
        System.out.println(nome.charAt(5));

    }
}
