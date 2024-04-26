class dateFashionSolution extends ConsoleProgram {
  public void run() {
      System.out.println(dateFashion(2, 4));
      System.out.println(dateFashion(8, 2));
      System.out.println(dateFashion(8, 3));
      System.out.println(dateFashion(5, 7));
  }

  /**
   * Determines the overall stylishness of you and your date
   * 
   * @param you   stylish rating for you
   * @param date  stylish rating for your date
   * @return 0 (no), 1 (maybe), 2 (yes)
   * @author: C. Chen
   */
  public int dateFashion(int you, int date) {
    if (you <= 2 || date <= 2) {
        return 0;
    }
    else if (you >= 8 || date >= 8) {
        return 2;
    }
    else {
        return 1;
    }
  }

}