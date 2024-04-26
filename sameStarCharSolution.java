class sameStarCharSolution extends ConsoleProgram {
  public void run() {
    System.out.println(sameStarChar("xy*yzz")); // should output true
    System.out.println(sameStarChar("xy*zzz")); // should output false
    System.out.println(sameStarChar("*xa*az")); // should output true
    System.out.println(sameStarChar("")); // should output true
    System.out.println(sameStarChar("abcDEF")); // should output true
    System.out.println(sameStarChar("*12*2*2")); // should output true
    System.out.println(sameStarChar("XY*YYYY*Z*")); // should output false
  }

  /**
   * Returns true if for every '*' (star) in the string, 
   * if there are chars both immediately before and after the star, they are the same.
   * @param str word/phrase
   * @return true if char on both sides of '*' are the same
   */
  public boolean sameStarChar(String str) {
    
    for (int i = 1; i < str.length() - 1; i++) {
      if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
        return false;
      }
    }

    return true;
  }
}
