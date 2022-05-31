package academy.devdojo.maratonajava.javacore.Aintrocucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrocucaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        // não necessita ser inicializado, ele inicializa o objeto com valores padrão
        System.out.println(estudante.nome);

        estudante.nome = "Sanjy";
        System.out.println(estudante.nome);
    }
}
