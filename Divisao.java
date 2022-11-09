import java.util.Scanner;

public class Divisao{
    public static void main(String [] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe um valor");
        int num1 = numeros.nextInt();

        System.out.println("Informe um segundo valor");
        int num2 = numeros.nextInt();

        while(num2 <= 0){
            System.out.println("O numero não pode ser menor ou igual a 0!");
            System.out.println("Informe um segundo valor");
            num2 = numeros.nextInt();
        }

        System.out.println("a divisão e " + (num1 / num2));
    }


}