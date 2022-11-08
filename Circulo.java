import java.util.Scanner;

public class Circulo{
    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe o Raio:");
        int raio = numeros.nextInt();
        double pi = 3.14;
        System.out.println( pi * (raio * raio));
    }
}   