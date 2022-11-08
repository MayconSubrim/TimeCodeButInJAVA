import java.util.Scanner;

public class Trapezio{
    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe a base menor:");
        int base_menor = numeros.nextInt();

        System.out.println("Informe a base maior:");
        int base_maior = numeros.nextInt();

        System.out.println("Informe a altura:");
        int h = numeros.nextInt();

        System.out.println(((base_maior + base_menor) * h) / 2 );
    }
}

