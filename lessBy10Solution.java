class lessBy10Solution extends ConsoleProgram {
  public void run() {
    System.out.println(lessBy10(1, 7, 11)); // should output true
    System.out.println(lessBy10(1, 7, 10)); // should output false
    System.out.println(lessBy10(11, 1, 7)); // should output true
    System.out.println(lessBy10(-10, 2, 2)); // should output true
    System.out.println(lessBy10(3, 30, 3)); // should output true 
  }

  /**
   * Checks if any of the the integers have a difference of 10 or more
   * @param a first integer
   * @param b second integer
   * @param c third integer
   * @return
   */
  public boolean lessBy10(int a, int b, int c) {
    int diffAB = Math.abs(a - b);
    int diffAC = Math.abs(a - c);
    int diffBC = Math.abs(b - c);

    if (diffAB >= 10 || diffAC >= 10 || diffBC >= 10) {
      return true;
    }
    else {
      return false;
    }
  }

}
