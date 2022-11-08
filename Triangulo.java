import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe a Base:");
        int base = numeros.nextInt();
        System.out.println("Informe a Altura:");
        int altura = numeros.nextInt();

        System.out.println((base * altura) * 2);
    }
}