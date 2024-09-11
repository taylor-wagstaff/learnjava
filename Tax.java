import java.util.Scanner;

public class Tax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter purchase amount: ");
    double purchaseAmount = input.nextDouble();
    double tax = purchaseAmount * 0.06;
    System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
  }

}

// Thus, the statement in line 11 displays the tax 11.85 
// with two digits after the decimal point. Note the expression 
// (int)(tax * 100) / 100.0 rounds down tax to two decimal places.