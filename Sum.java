import java.util.Scanner;

public class Sum {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i = 1;
    while (i <= n) {
      int j = 1;
      int sum = 0;
      while (j < i) {
        System.out.print(j);
        System.out.print("+");
        sum += j;
        j++;
      }
      sum += j;
      System.out.print(j +"="+sum);
      System.out.println();
      i++;
    }
  }
}
