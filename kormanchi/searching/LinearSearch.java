import java.util.*;

public class LinearSearch{

	public int linearSearch(int[] arr, int data){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==data) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		//int[] arr={1,2,3,4,5,6,7};

/*
		//Taking input from console
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number of array elements");
		n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}*/


		
		System.out.println(new LinearSearch().linearSearch(arr,n));


	}
}
