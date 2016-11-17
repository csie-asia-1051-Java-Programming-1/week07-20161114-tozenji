package hw;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021118  鄭曉玫
 */
public class hw02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test;
		System.out.print("輸入一個正整數值(不含 0)");
		Scanner scn = new Scanner(System.in);
		test=scn.next();
		int i=Integer.parseInt(test);
		int j=0;
		System.out.print(digits(i,j));
	}
	public static int digits(int m,int n){
		if(m!=0){
			n++;
			return digits(m/10,n);
		}else{
			return n;
		}
	}
}
