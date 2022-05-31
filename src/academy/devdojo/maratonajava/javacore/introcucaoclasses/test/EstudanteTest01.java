package academy.devdojo.maratonajava.javacore.introcucaoclasses.test;

import academy.devdojo.maratonajava.javacore.introcucaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Renato";
        estudante1.idade = 30;
        estudante1.sexo = 'M';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

    }
}
