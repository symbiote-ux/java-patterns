import java.util.Scanner;

public class Diamond{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i = 1;
    int half = n / 2;
    while (i <= half + 1) {
      int j = half;
      while (j >= i) {
        System.out.print(" ");
        j--;
      }
      j = 1;
      while (j <= i * 2 - 1) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i++;
    }
    i = half;
    while (i >= 1) {
      int j = 1;
      while (j <= half - i + 1) {
        System.out.print(" ");
        j++;
      }
      j = 1;
      while (j <= i * 2 - 1) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i--;
    }
  }
}