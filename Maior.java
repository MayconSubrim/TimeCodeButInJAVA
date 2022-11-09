import java.util.Scanner;

public class Maior{
    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int num1 = numeros.nextInt();

        System.out.println("Informe um numero:");
        int num2 = numeros.nextInt();

        System.out.println("Informe um numero:");
        int num3 = numeros.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("o " + num1 + " e o maior!");
        }
        else if(num2 > num3 && num2 > num1){
            System.out.println("o " + num2 + " e o maior!");
        }
        else{
            System.out.println("o " + num3 + " e o maior!");
        }
    }
}