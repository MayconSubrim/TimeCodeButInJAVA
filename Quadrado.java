import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe o lado:");
        int lado = numeros.nextInt();

        System.out.println(lado * lado);
    }
}