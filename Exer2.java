import java.util.Scanner;  // Import the Scanner class

public class Exer2 {
  public static void main(String[] args) {
    Scanner nomeUser = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Informe seu nome:");

    String userName = nomeUser.nextLine();  // Read user input
    System.out.println("Olá, " + userName + "!");  // Output user input
  }
}