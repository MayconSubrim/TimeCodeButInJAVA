import java.util.Scanner;

public class Maiorsoma{
    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int num1 = numeros.nextInt();

        System.out.println("Informe um numero:");
        int num2 = numeros.nextInt();

        System.out.println("Informe um numero:");
        int num3 = numeros.nextInt();

        if (num1 > num2 && num3 > num2){
            System.out.println("A soma dos 2 maiores e " + (num1 + num3));
        }
        else if(num2 > num3 && num1 > num3){
            System.out.println("A soma dos 2 maiores e " + (num2 + num1));
        }
        else{
            System.out.println("A soma dos 2 maiores e " + (num3 + num2));
        }
    }
}