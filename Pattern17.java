package fundamentals;
import java.util.Scanner;

public class Pattern17{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i <= n) {
			int spaces =1;
			while(spaces <= n -i) {
				System.out.print(" ");
				spaces++;
			}
			int num = 1;
			while(num <= i) {
				System.out.print("*");
				num++;
			}
			int decreNum = i -1;
			while( decreNum >= 1) {
				System.out.print("*");
				decreNum--;
			}
			System.out.println();
			i++;
		}
	}

}