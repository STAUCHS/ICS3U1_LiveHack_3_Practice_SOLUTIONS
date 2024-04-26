class shareDigitSolution extends ConsoleProgram {
  public void run() {
    System.out.println(shareDigit(12, 23)); // should output true
    System.out.println(shareDigit(21, 23)); // should output true
    System.out.println(shareDigit(12, 32)); // should output true
    System.out.println(shareDigit(21, 32)); // should output true
    System.out.println(shareDigit(12, 34)); // should output false
  }
  
  /**
   * Checks if two numbers share at least one digit
   * @param a first integer
   * @param b second integer
   * @return true if a and b share at least one digit
   */
  public boolean shareDigit(int a, int b) {
    int aLeft = a/10;
    int aRight = a%10;
    int bLeft = b/10;
    int bRight = b%10;

    if (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight) {
      return true;
    }

    else {
      return false;
    }
  }
}
