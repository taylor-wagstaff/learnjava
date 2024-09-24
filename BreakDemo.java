class BreakDemo {
  public static void main(String[] args) {
    int num;
    num = 100;
    // loop while i-squared is less than num
    for (int i = 0; i < num; i++) {
      if (i * i >= num)
        break; // terminate loop if i*i >= 100
      System.out.print(i + " ");
    }
    System.out.println("Loop complete.");
  }
}

// It is possible to force an immediate exit from a loop, bypassing any
// remaining
// code in the body of the loop and the loop’s conditional test, by using the
// break statement.
// When a break statement is encountered inside a loop, the loop is terminated
// and program control
// resumes at the next statement following the loop.