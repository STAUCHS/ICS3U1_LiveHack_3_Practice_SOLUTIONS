class countCodeSolutions extends ConsoleProgram {
  public void run() {
    System.out.println(countCode("aaacodebbb")); // should output 1
    System.out.println(countCode("codexxcode")); // should output 2
    System.out.println(countCode("cozexxcope")); // should output 2
    System.out.println(countCode("cozcop")); // should output 0
    System.out.println(countCode("")); // should output 0
    System.out.println(countCode("ode")); // should output 0
    System.out.println(countCode("AAcodeBBcoleCCccoreDD")); // should output 3
  }

  /**
   * Count the number of times the word co_e appears in a string
   * _ can be any letter
   * @param str word or phrase
   * @return the number of times the word co_e appears
   */
  public int countCode(String str) {
    int count = 0;
    String firstTwo;
    String lastLetter;

    // Loop through string to check for "co_e"
    for (int i = 0; i < str.length() - 3; i++) {
      firstTwo = str.substring(i, i + 2); // gives back the first 2 letters
      lastLetter = str.substring(i + 3, i + 4); // give back the 4th letter

      // Check if the first two letters == "co" and the last letter == "e"
      if (firstTwo.equals("co") && lastLetter.equals("e")) {
        count++;
      }
    }

    return count;
  }
}
