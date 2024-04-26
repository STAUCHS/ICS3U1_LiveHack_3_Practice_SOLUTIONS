class old35Solution extends ConsoleProgram {
  public void run() {
    System.out.println(old35(15)); // should output false
    System.out.println(old35(9)); // should output true
    System.out.println(old35(10)); // should output true
    System.out.println(old35(19)); // should output false
  }

  /**
   * Checks if non-negative integer is divisible by 3 OR 5, but not both
   * @param n non-negative integer
   * @return  true if divisible by 3 or 5, false otherwise
   */
  public boolean old35(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return false;
    }
    else if (n % 3 == 0 || n % 5 == 0) {
      return true;
    }
    else {
      return false;
    }
  }
}
