class bobThereSolution extends ConsoleProgram {
  public void run() {
    System.out.println(bobThere("abcbob")); // should output true
    System.out.println(bobThere("b9b")); // should output true
    System.out.println(bobThere("bac")); // should output false
    System.out.println(bobThere("abcdefb")); // should output false
    System.out.println(bobThere("bbb")); // should output true
    System.out.println(bobThere("bb")); // should output false
    System.out.println(bobThere("b")); // should output false
  }

  /**
   * Return true if the given string contains a "bob" string, 
   * but where the middle 'o' char can be any char.
   * @param str word or phrase
   * @return true if string contains b_b
   */
  public boolean bobThere(String str) {
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
        return true;
      }
    }

    return false;
  }
}
