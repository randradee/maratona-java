package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pra ninguem";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar: mensagemNaoDoar;;

        System.out.println(resultado);
    }
}
