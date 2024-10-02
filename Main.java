import java.util.Scanner; //import the scanner class


public class Main {

   public static void main(String []args) {
      System.out.println("Testing methods that return values...");

      Scanner scan = new Scanner(System.in);
      //System.in is the computers keyboard
      /*
      System.out.println("Enter some text.");
      String inputStr = scan.nextLine();
      System.out.println("Enter a whole number.");
      int inputInt = scan.nextInt();
      System.out.println("Enter a decmial number.");
      double inputDouble = scan.nextDouble();


      // Handle the user input (do something with the values)
      // Use teh value in a print statement
      System.out.println("You entered:  ");
      // Use values in an expression
     
      */
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

      // STRING METHODS
      // .length() returns number of charecterts
      int messageLength = message.length();
      System.out.println("Length: " + messageLength);
      // .length() - 1 represents final index
      System.out.println("Final Index: " + (message.length()-1));
      
      //Use index to access charecter(s)
      // .substring (int,int) return a String from first index to second index
      // not including the charecter at the second int index
      String firstWord = message.substring(0,4);
      System.out.println(firstWord);

      // .substring(int) returns a String from first index to end of string

      String lastWord = message.substring(8);
      System.out.println(lastWord);

      // .indexOf(String) returns an int representing the index or position of the String argument passed in
      int indexOfAwesome = message.indexOf("awesome");
      System.out.println(indexOfAwesome);

      // Not on AP exam but still useful
      System.out.println(message.toUpperCase());
      System.out.println(message.toLowerCase());

      // .equals compares a parameter String to the calling String then returns a boolean representing whether they are equal
      String s1 = " I am tired";
      String s2 = "It is almost the weekend";

      boolean isEqual = s1.equals(s2);
      System.out.println(isEqual);
      boolean isEqualAgain = s1.equals("I am tired.");
      System.out.println(isEqualAgain);
      
      String a = "ape";
      String z = "zebra";

      System.out.println(a.compareTo(z));
      System.out.println(z.compareTo(a));
   }
}