package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021118  ¾G¾åª´
 */
public class ex01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int i,sum=0;
		int n=scn.nextInt();
		double d = 0;
		int f[ ]=new int[n];
				for(i=0;i<n;i++){
				System.out.println(double)("%d",&f[i]);
				sum+=f[i];
				d+=f[i]*f[i];
				}
              double avg = sum/n;
              System.out.println("var="+d/n-avg*avg);
	}

}
