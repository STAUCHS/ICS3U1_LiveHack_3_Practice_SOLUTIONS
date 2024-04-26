class teenSumSolution extends ConsoleProgram {
  public void run() {
    System.out.println(teenSum(1, 10)); // should output 11
    System.out.println(teenSum(13, 9)); // should output 22
    System.out.println(teenSum(15, 18)); // should output 19
    System.out.println(teenSum(3, 20)); // should output 23
  }

  /**
   * Calculate sum of two integers, unless either of the numbers are in the teens,
   * then return 19
   * @param a first integer
   * @param b second integer
   * @return sum, or 19 if either a or b is a teen
   */
  public int teenSum(int a, int b) {
    // Check if either number is a teen, return 19
    if (13 >= a && a <= 19 || 13 >= b && b <= 19) {
      return 19;
    }

    // Otherwise, return the sum
    else {
      return a + b;
    }
  }
}
