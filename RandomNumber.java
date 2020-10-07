import java.util.Scanner;

public class RandomNumber{
  public static void main(String args[]){    
    //Challenge 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a negative number");
    int num1 = sc.nextInt();
    System.out.println("Give me a number greater than " + Math.abs(num1));
    int num2 = sc.nextInt();

    int ran1 = (int)(Math.random()*(num2 - num1) + num1);
    int ran2 = (int)(Math.random()*(num2 - num1) + num1);

    System.out.println("you got " + ran1 + " and a " + ran2);

    //Challenge 2
    Scanner mb = new Scanner(System.in);
    System.out.println("give me a name");
    String name = mb.next();
    System.out.println("give me a noun");
    String noun = mb.next();
    System.out.println("give me an animal for a pet");
    String pet= mb.next();
    System.out.println("Give me a time of day(ex. noon, morning)");
    String time = mb.next();
    System.out.println("give me a number");
    int num = mb.nextInt();
    System.out.println("One day " + name + " went for a jog and came across a "+ noun + " he looked at it for a very long time and decided he would take it home. Once he was home he his "+ pet + " played with it. By " + time + " the "+ noun + " was part of the house and it stayed that way for " + num + " years until it died.");
  }
}