package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // I want to know how much I have to pay in taxes in the Netherlands in 2020 based on my annual salary
        double annualIncome = 70000;

        double tax = annualIncome >=0 && annualIncome <= 34712 ? 9.7 : annualIncome > 34712 && annualIncome <= 68507 ? 37.35 : 49.50;

        System.out.println("You have to pay "+tax+"% in taxes");
    }
}
