import java.util.*;
public class CWC4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x,y,sum;
		x=sc.nextInt();
		y=sc.nextInt();
		
		sum=x-~y-1;
		System.out.println("the sum is:"+sum);
	}

}