import java.util.Scanner;


public class HiLo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String playAgain = "";


  

    do {
      int theNumber = (int)(Math.random() * 100 + 1);
      int guess = 0;
      int numberTries = 0;


      while (guess != theNumber ){
        System.out.println("Guess a number between 1 and 100");
        guess = scan.nextInt();
        numberTries =  numberTries + 1;
        if (guess < theNumber)
          System.out.println(guess + " is too low. try again" + "number of tries " +  numberTries);
        else if (guess > theNumber)
          System.out.println(guess + " is too high.Try again!" + "number of tries " +  numberTries);
        else 
          System.out.println( guess + " is correct" + "number of tries " +  numberTries);
    
      }
      System.out.println("WOuld you like to play again?");
      playAgain = scan.next();
    } while (playAgain.equalsIgnoreCase("y"));
    System.out.println("Thank you for playing! Goodbye."); 
    scan.close();
  }
}  