class prefixAgainSolution extends ConsoleProgram {
  public void run() {
    System.out.println(prefixAgain("abXYabc", 1)); // should output true
    System.out.println(prefixAgain("abXYabc", 2)); // should output true
    System.out.println(prefixAgain("abXYabc", 3)); // should output false
    System.out.println(prefixAgain("a", 1)); // should output false
    System.out.println(prefixAgain("ab", 1)); // should output false
    System.out.println(prefixAgain("aa", 1)); // should output true
  }

  /**
   * Given a string, consider the prefix string made of the first N chars of the string. 
   * Does that prefix string appear somewhere else in the string? 
   * Assume that the string is not empty and that N is in the range 1..str.length().
   * 
   * @param str word or phrase
   * @param n number to determine length of prefix
   * @return true if the prefix appears elsewhere in the string
   */
  public boolean prefixAgain(String str, int n) {
    // Get prefix
    String prefix = str.substring(0, n);

    // Loop through the string starting at index n up to (length - n)
    for (int i = n; i <= str.length() - n; i++) {
      if (str.substring(i, i + n).equals(prefix)) {
        return true;
      }
    }

    return false;
  }
}
