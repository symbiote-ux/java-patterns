import java.util.Scanner;
public class HalfDiamond {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i = 1;
    while (i <= n + 1) {
      System.out.print("*");
      int j = 1;
      while (j < i) {
        System.out.print(j);
        j++;
      }
      j = i - 2;
      while (j >= 1) {
        System.out.print(j);
        j--;
      }
      if (i != 1)
        System.out.print("*");
      System.out.println();
      i++;
    }
    i = n - 1;
    while (i >= 1) {
      System.out.print("*");
      int j = 1;
      while (j <= i) {
        System.out.print(j);
        j++;
      }
      j = 1;
      while (i > j) {
        System.out.print(j);
        j++;
      }
      System.out.print("*");
      System.out.println();
      i--;
    }
    System.out.print("*");
  }
}
