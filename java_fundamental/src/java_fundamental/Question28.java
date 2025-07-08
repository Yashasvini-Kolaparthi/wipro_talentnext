package java_fundamental;
import java.util.Scanner;
public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		boolean skip=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==6)
			{
				skip=true;
			}
			if(!skip)
			{
				sum+=arr[i];
			}
			if(arr[i]==7&&skip)
			{
				skip=false;
			}
		}
		System.out.print("Sum of array of numbers(excluding 6 to 7) : "+sum);

	}

}
