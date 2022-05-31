package academy.devdojo.maratonajava.javacore.Aintrocucaoclasses.dominio;

import java.util.Date;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    public void printInfos (){
        System.out.println("Marca: " + this.marca + " Modelo: " + this.modelo + " Ano: " + this.ano);
    }
}
