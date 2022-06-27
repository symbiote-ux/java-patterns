import java.util.Scanner;

public class OddSquare {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i = 1;
    while (i <= n) {
      int j = i * 2 - 1;
      while (j < n * 2) {
        System.out.print(j);
        j += 2;
      }
      j = 1;
      while (j < i * 2 - 1) {
        System.out.print(j);
        j += 2;
      }
      System.out.println();
      i++;
    }
  }
}
