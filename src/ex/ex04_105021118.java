package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021118  ¾G¾åª´
 */
public class ex04_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));
		

	}
	public static int fun(int x){
		if(x==1){
			return 1;
		}else{
			return x*fun(x-1);
		}
	}

}
