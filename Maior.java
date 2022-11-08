import java.util.Scanner;

public class Losango{
    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe a diagonal maior:");
        int Diagonal_menor = numeros.nextInt();

        System.out.println("Informe a diagonal menor:");
        int Diagonal_maior = numeros.nextInt();

        System.out.println((Diagonal_maior * Diagonal_menor) / 2 );
    }
}