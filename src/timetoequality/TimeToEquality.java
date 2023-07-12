package timetoequality;

import java.util.Scanner;

public class TimeToEquality {
	
	public static int timeToEquality(int array[],int size,int max) {
		int counter = 0;
		for(int i=0;i<size;i++){
			if(array[i]>max)
				max=array[i];
		}
		for(int i=0;i<size;i++) {
			counter+=max-array[i];
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);		
		int max = Integer.MIN_VALUE;
		int n=scanner.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = timeToEquality(array,n,max);
		System.out.println(results);
	}

}
