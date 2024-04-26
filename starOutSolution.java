class starOutSolution extends ConsoleProgram {
  public void run() {
    System.out.println(starOut("ab*cd")); // should output ad
    System.out.println(starOut("ab**cd")); // should output ad
    System.out.println(starOut("sm*eilly")); // should output silly
    System.out.println(starOut("sm**eil*ly")); // should output siy
    System.out.println(starOut("stringy*")); // should output string
    System.out.println(starOut("abc")); // should output abc
    System.out.println(starOut("a*b")); // should output nothing
    System.out.println(starOut("*")); // should output nothing
    System.out.println(starOut("")); // should output nothing
  }

  /**
   * Return a version of the given string, where for every star (*) in the string the star
   * and the chars immediately to its left and right are gone. 
   * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
   * @param str word/phrase
   * @return String without * and all chars before and after each *
   */
  public String starOut(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      // Continue loop if current char is *
      if (str.charAt(i) == '*') {
        continue;
      }

      // Continue loop if previous char is *
      if (i > 0 && str.charAt(i - 1) == '*') {
        continue;
      }

      // Conintue loop if next char is *
      if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
        continue;
      }
      
      // If no conditions above are true, add current char to result
      result += str.charAt(i);
    }

    return result;
  }
}
