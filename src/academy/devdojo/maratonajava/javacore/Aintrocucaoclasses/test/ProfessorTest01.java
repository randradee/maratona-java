package academy.devdojo.maratonajava.javacore.Aintrocucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrocucaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Raul";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
