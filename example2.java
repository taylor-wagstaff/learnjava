class example2 {

  public static void main(String[] args) {
    int myVar1;
    int myVar2;
    int v; // this declares an int variable
    double x; // this declares a floating-point variable

    myVar1 = 0;
    myVar2 = 1024;

    v = 10; // assign v the value 10
    x = 10.0; // assign x the value 10.0

    System.out.println("myVar2" + myVar2);

    myVar2 = myVar1 / 2;

    System.out.print("myVar2 contains myVar1 / 2: ");
    System.out.println(myVar2);

    System.out.println("Original value of v: " + v);
    System.out.println("Original value of x: " + x);
    System.out.println(); // print a blank line
    // now, divide both by 4
    v = v / 4;
    x = x / 4;
    System.out.println("v after division: " + v);
    System.out.println("x after division: " + x);

  }

}