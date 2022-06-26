package fundamentals;
import java.util.Scanner;

public class Pattern15{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i <= n) {
			int j = 1;
			int num = n - i + 1;
			while(j <= num) {
				System.out.print(num);
				j++;
			}
			num--;
			System.out.println();
			i++;
		}
	}

}