package java_fundamental;
import java.util.Scanner;
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter "+n+" numbers : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Target Element : ");
		int tar=sc.nextInt();
		int index=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==tar)
			{
				index=i;
				break;
			}
		}
		if(index==-1)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println("Element found at index : "+index);
		}

	}

}
