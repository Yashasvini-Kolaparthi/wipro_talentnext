package java_fundamental;
import java.util.Arrays;
import java.util.Scanner;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.print("Enter numbers : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println("Maximum value of an array : "+arr[0]);
		System.out.println("Minimum value of an array : "+arr[n-1]);
	    
		

	}

}
