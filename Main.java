import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x = 0;
    int y;
    Scanner input = new Scanner(System.in);
    String ohNo[] = new String[5];
    while (x <= 4) {
      System.out.println("Please enter string for array element " + (x+1));
      ohNo[x] = input.next();
      x++;
    }
    x=0;
    while (x <= 4) {
      System.out.println("Index"+x+" is defined as "+ohNo[x]);
      x++;
    }

  }
}