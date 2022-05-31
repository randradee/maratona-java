package academy.devdojo.maratonajava.javacore.Aintrocucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrocucaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Argo";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "Volkswagen";
        carro2.modelo = "Polo";
        carro2.ano = 2022;

        carro1.printInfos();
        carro2.printInfos();
    }
}
