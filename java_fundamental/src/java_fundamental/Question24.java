package java_fundamental;

import java.util.Scanner;

public class Question24{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int []ascii=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		ascii[i]=sc.nextInt();
    	}
    	for(int value : ascii)
    	{
    		System.out.print((char) value);
    	}
        
        
    }
}

