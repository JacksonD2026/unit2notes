import java.util.Scanner; //import the scanner class


public class Main {

   public static void main(String []args) {
      System.out.println("Testing methods that return values...");

      Scanner scan = new Scanner(System.in);
      //System.in is the computers keyboard

      System.out.println("Enter some text.");
      String inputStr = scan.nextLine();
      System.out.println("Enter a whole number.");
      int inputInt = scan.nextInt();
      System.out.println("Enter a decmial number.");
      double inputDouble = scan.nextDouble();


      // Handle the user input (do something with the values)
      // Use teh value in a print statement
      System.out.println("You entered:  + inputStr");
      // Use values in an expression
      int sum = inputInt + inputDouble;

   }
}
