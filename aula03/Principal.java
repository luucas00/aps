package aula03;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);


        Carro c1 = new Carro("A", 2,  4);
        Moto m1 = new Moto("B",  2, 200);

        System.out.println("Modelo: ");
        c1.SetModelo(teclado.nextLine());
        
        System.out.println("Ano: ");
        c1.SetAno(teclado.nextInt());

        c1.imprimirDetalhes();

        System.out.println("Modelo: ");
        m1.SetModelo(teclado.nextLine());

        System.out.println("Ano: ");
        m1.SetAno(teclado.nextInt());

        m1.imprimirDetalhes();
        
        
        teclado.close();
    }
}
