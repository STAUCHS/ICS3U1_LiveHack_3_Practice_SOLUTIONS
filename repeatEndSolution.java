class repeatEndSolution extends ConsoleProgram {
  public void run() {
    System.out.println(repeatEnd("Hello", 3)); // should output llollollo
    System.out.println(repeatEnd("Hello", 2)); // should output lolo
    System.out.println(repeatEnd("Hello", 1)); // should output o
    System.out.println(repeatEnd("Hello", 0)); // should output nothing
    System.out.println(repeatEnd("1234", 2)); // should output 3434
    System.out.println(repeatEnd("", 0)); // should output nothing
  }

  /**
   * Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
   * Assume that n is between 0 and the length of the string, inclusive.
   * @param str word or phrase
   * @param n number of times to repeat
   * @return last n characters repeated n times
   */
  public String repeatEnd(String str, int n) {
    String result = "";
    String lastNChars = str.substring(str.length() - n, str.length());

    for (int i = 0; i < n; i++) {
      result += lastNChars;
    }

    return result;
  }
}
