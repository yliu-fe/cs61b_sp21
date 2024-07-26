/**
 * Class that prints the Collatz sequence starting from a given number.
 * 
 * @author Yi Liu
 */
public class Collatz {

  public static int nextNumber(int n) {
    /**
     * Returns the next number of Collatz sequence
     * fixing the bug of the original skeleton code.
     */
    if (n % 2 == 0) {
      return n / 2;
    } else {
      return 3 * n + 1;
    }
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.print(n + " ");
    while (n != 1) {
      n = nextNumber(n);
      System.out.print(n + " ");
    }
    System.out.println();
  }
}
