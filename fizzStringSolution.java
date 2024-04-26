class fizzStringSolution extends ConsoleProgram {
  public void run() {
    System.out.println(fizzString("fig")); // should output Fizz
    System.out.println(fizzString("dib")); // should output Buzz
    System.out.println(fizzString("fib")); // should output FizzBuzz
    System.out.println(fizzString("abc")); // should output abc 
  }

  /**
   * If str starts with f, return Fizz
   * If str ends with b, return Buzz
   * If str starts with f and ends with b return FizzBuzz
   * In all other cases, return the str back
   * 
   * @param str word, sentence, or phrase
   * @return Fizz, Buzz, FizzBuzz or str
   * @author C. Chen
   */

  public String fizzString(String str) {
    if (str.indexOf("f") == 0 && str.charAt(str.length() - 1) == 'b') {
      return "FizzBuzz";
    }

    else if (str.indexOf("f") == 0) {
      return "Fizz";
    }

    else if (str.charAt(str.length() - 1) == 'b') {
      return "Buzz";
    }

    else {
      return str;
    }
  }
}
