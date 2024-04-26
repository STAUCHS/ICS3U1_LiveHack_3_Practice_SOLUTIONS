class sortaSumSolution extends ConsoleProgram {

  public void run() {
    System.out.println(sortaSum(3, 4));
    System.out.println(sortaSum(9, 4));
    System.out.println(sortaSum(10, 11));
  }
  
  /**
   * Sums two numbers unless the sum is in the range 10 to 19, inclusive,
   * in which case, sum will be 20
   * 
   * @param a  first integer
   * @param b  second integer
   * @return sum of a and b or 20 if sum is in range 10 to 19, inclusive
   * @author: C. Chen
   */
  public int sortaSum(int a, int b) {
    // Declare sum
    int sum = a + b;

    // Check if sum is between 10 and 19 inclusive
    if (sum >= 10 && sum <= 19) {
      return 20;
    }
  
    // All other cases, sum as normal
    else {
      return sum;
    }
  }
}
