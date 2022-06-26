package fundamentals;
import java.util.Scanner;

public class Solution {
	   static int fact(int number) {  
		      int f = 1;  
		      int j = 1;  
		      while(j <= number) {  
		         f = f * j;  
		         j++;  
		      }  
		      return f;  
		   }
	   static int getCombination(int num1,int num2) {
		   return fact(num1)/(fact(num2)*fact(num1-num2));
		}
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int a = getCombination(4,x);
        int b = getCombination(4, n - x);
        int sampleSpace = getCombination(8, n);
        double prob = (double)((a * b) *100) / sampleSpace;       
        System.out.println((int)prob);
	}
}