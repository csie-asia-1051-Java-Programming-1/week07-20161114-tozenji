package hw;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021118  ¾G¾åª´
 */
public class hw04_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(gcd(m,n));
	}
	public static int gcd(int m,int n){
		int r=m%n;
		if(r==0){
			return n;
		}else{
			return gcd(n,r);
		}
		
		
	}

}
