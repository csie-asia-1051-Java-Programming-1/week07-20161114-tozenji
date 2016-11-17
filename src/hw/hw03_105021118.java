package hw;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021118  ¾G¾åª´
 */
import java.util.Scanner;

public class hw03_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
	int n1=scn.nextInt();
	int m=scn.nextInt();
	System.out.println(fun(n1,m));
	}
	public static int fun(int n1,int m){
		int sum1=1;
		int sum2=1;
		int sum3=1;
		int sum4=1;
		for(int i=n1;i>0;i--){
			sum1=sum1*i;
		}
		for(int i=m;i>0;i--){
			sum2=sum2*i;
		}
		for(int i=n1-m;i>0;i--){
			sum3=sum3*i;
	}
		sum4=sum1/(sum2*sum3);
		return sum4;
	}
	}
