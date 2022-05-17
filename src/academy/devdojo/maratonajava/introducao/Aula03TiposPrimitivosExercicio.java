package academy.devdojo.maratonajava.introducao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Renato";
        String endereco = "Rua da Caixa D'Agua, 01";
        double salario = 25.99;

        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDateTime = data.format(format);

        System.out.println("Eu "+nome+", morando no endereco "+endereco+",\nconfirmo que recebi o salario de "+salario+", na data "+formatDateTime);
    }
}
