import java.util.Scanner;

public class DisplayTime {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("enter an integer");

    int seconds = input.nextInt();
    int minutes = seconds / 60;

    int remainingSeconds = seconds % 60;
    System.out.println(seconds + "seconds is " + minutes + "minutes and " + remainingSeconds + "seconds Reaming");

    // using math to the power of
    System.out.println(Math.pow(2, 3));
    System.out.println(Math.pow(2, 3));
    System.out.println(Math.pow(4, 0.5));

    // By default, an integer literal is a decimal integer number.
    System.out.println(0B1111);// Displays 15
    System.out.println(07777); // Displays 4095
    System.out.println(0XFFFF); // Displays 65535

    // You can make a number a float by appending the letter f or F, and you can
    // make a number a double by appending the letter d or D.
    System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);

    // Java allows you to use underscores to separate two digits in a number
    // literal. For example, the following literals are correct.
    long longValue = 232_45_4519;
    System.out.println(longValue);
  }

}