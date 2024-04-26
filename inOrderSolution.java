class inOrderSolution extends ConsoleProgram {
  public void run() {
    System.out.println(inOrder(1, 2, 4, false)); // should output true
    System.out.println(inOrder(1, 2, 1, false)); // should output false
    System.out.println(inOrder(1, 1, 2, true)); // should output true 
    System.out.println(inOrder(3, 2, 4, true)); // should output true
  }

  /**
   * Check if a, b, c and are in order, unless bOk is true,
   * then b doesn't need to be greater than a
   * 
   * @param a first number
   * @param b second number
   * @param c third number
   * @param bOk true - allows b to be less than or equal to a
   * @return true if numbers are in order
   */
  public boolean inOrder(int a, int b, int c, boolean bOk) {
    if (bOk != true && a < b && b < c) {
      return true;
    }
    else if (bOk && b < c) {
      return true;
    }
    else {
      return false;
    }
  }
}
