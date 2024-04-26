class in1To10Solution extends ConsoleProgram {
  public void run() {
    System.out.println(in1To10(1, false));
    System.out.println(in1To10(5, true));
    System.out.println(in1To10(11, false));
    System.out.println(in1To10(0, true));
  }

  /**
   * Checks if n is between 1 and 10 unless outsideMode is true,
   * then check if n is <= 1 or >= 10
   * 
   * @param n integer
   * @param outsideMode if true, changes the condition for n (<= 1 or >= 10)
   * @return true if n between 1 and 10 or (<= 1 or >= 10) if outsideMode is true
   */
  public boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode && n <= 1 && n >= 10) {
      return true;
    }
    else if (outsideMode != true && n >= 1 && n <= 10) {
      return true;
    }
    else {
      return false;
    }
  }
}
