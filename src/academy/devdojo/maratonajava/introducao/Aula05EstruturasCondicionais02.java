package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 120;
        if (idade < 15){
            System.out.println("categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");
        }else{
            System.out.println("categoria adulta");
        }
    }
}
