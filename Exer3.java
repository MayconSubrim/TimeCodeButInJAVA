import java.util.Scanner;  // Import the Scanner class

public class Exer3 {
  public static void main(String[] args) {
    Scanner nomeUser = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Informe seu nome:");
    String userName = nomeUser.nextLine();  // Read user input

    System.out.println("Informe Sua idade");
    int idadeUser = nomeUser.nextInt();

    System.out.println("Olá, " + userName + " , sua idade é " + idadeUser "!");  // Output user input
  }
}