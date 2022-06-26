package fundamentals;
import java.util.Scanner;

public class Pattern18{

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
			int p = i;
			int num = 1;
			while(num <= i) {
				System.out.print(p);
				num++;
				p++;
			}
			 p = p - 1;
			while( p > 1) {
				System.out.print(p);
				p--;
			}
			System.out.println();
			i++;
		}
	}

}