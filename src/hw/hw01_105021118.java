package hw;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021118  ¾G¾åª´
 */
import java.util.Scanner;

public class hw01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		System.out.println(gcd(x,y,z)*(x/gcd(x,y,z))*(y/gcd(x,y,z))*(z/gcd(x,y,z)));
			
	        }
	public static int gcd(int x,int y){
		int r=x%y;
		if(r==0){
			return y;
		}else{
			return gcd(y,r);
		}
	}
	public static int gcd(int x,int y,int z){
		return gcd(gcd(x,y),z);
	}
	}


