import java.util.Scanner; //import the scanner class


public class Main {

   public static void main(String []args) {
      System.out.println("Testing methods that return values...");

      Scanner scan = new Scanner(System.in);
      //System.in is the computers keyboard

     // System.out.println("Enter some text.");
      //String inputStr = scan.nextLine();
      //System.out.println("Enter a whole number.");
     // int inputInt = scan.nextInt();
      //System.out.println("Enter a decmial number.");
     // double inputDouble = scan.nextDouble();


      // Handle the user input (do something with the values)
      // Use teh value in a print statement
      System.out.println("You entered:  ");
      // Use values in an expression
     

      // STRING CLASS
      String message = new String("apcs is awesome");
      // new easier way
      String greeting = "Hello coders";

      // Concatanate (combine) two or more string objects
      String concatenated = greeting + message; 
      System.out.println(concatenated);
      System.out.println(greeting + "" + message);
      // can combine String variables and String literals5
      
      // Numbers get converted to a String when concatanating
      System.out.println("I am " + 28 + " years old");
      System.out.println("12" + 4 + 3);//1243 , if theres a string involved, it will concatinate and not add
      System.out.println("12" + (4 + 3));//127
      System.out.println( 12 + 4 + 3 );//NOT concatanation, just addition
      System.out.println(("12") + 4 + 3);
   }
}
