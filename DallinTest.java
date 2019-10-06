import java.util.Scanner;

public class DallinTest{
  public static void main (String args[]){
    sayHello();
  }

  private static void sayHello() {
    Scanner input = new Scanner(System.in);
    System.out.println("What's your name?");
    String name = input.next();
    String hey = "Hello, " + name+ "!";
    System.out.println(hey);
    //test comment
  }
}
