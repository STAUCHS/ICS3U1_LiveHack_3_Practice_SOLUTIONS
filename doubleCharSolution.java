class doubleCharSolution extends ConsoleProgram {
  public void run() {
    System.out.println(doubleChar("The")); // should output TThhee
    System.out.println(doubleChar("Hello!")); // should output HHeelllloo!!
    System.out.println(doubleChar("@@")); // should output @@@@
  }

  /**
   * Doubles every character in a string
   * 
   * @param str A word, sentence, or phrase
   * @return The given string with every character doubled
   * @author: C. Chen
   */

   public String doubleChar(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);

        result += Character.toString(c) + Character.toString(c);
    }

    return result;

  }
}
