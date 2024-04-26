class redTicketSolution extends ConsoleProgram {
  public void run() {
    System.out.println(redTicket(2, 2, 2)); // should output 10
    System.out.println(redTicket(0, 0, 0)); // should outout 5
    System.out.println(redTicket(1, 2, 2)); // should output 1
    System.out.println(redTicket(1, 2, 2)); // should output 0

  }
  
  public int redTicket(int a, int b, int c) {
    if (a == 2 && b == 2 && c == 2) {
      return 10;
    }

    else if (a == b && b == c && a == c) {
      return 5;
    }

    else if (a != b && a != c) {
      return 1;
    }

    else {
      return 0;
    }
  }
}
