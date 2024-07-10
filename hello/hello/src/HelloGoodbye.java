import java.util.Scanner;

/**
 * HelloGoodbye
 */
public class HelloGoodbye {
public static void main(String[] args) {
  Scanner myObj = new Scanner(System.in);
  String names = myObj.nextLine();

  String[] name = names.split(" ");

  System.out.println("Hello " + name[0] + " and " + name[1] + ".");
  System.out.println("Goodbye " + name[1] + " and " + name[0] + ".");
}
}