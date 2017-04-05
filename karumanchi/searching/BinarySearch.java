import java.util.*;

public class BinarySearch{

	public int binSearch(int[] arr, int data){
		
		int low=0;
		int high=arr.length-1;
		int mid;

		while(low<=high){
			mid=low+(high-low)/2; //To Override overflow 
			if(arr[mid]==data) return mid;
			else if(data<arr[mid]) high=mid-1;
			else low=mid+1;
		}
		return -1;
	}

	public int recBinSearch(int[] arr, int low, int high, int data){
		if(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==data) reurn mid;
			else if(data<arr[mid]) return recBinSearch(arr,low,mid-1,data);
			else return recBinSearch(arr,mid+1,high,data);
		}
		return -1;
	}

	public static void main(String[] args) {
		//int[] arr={1,2,3,4,5,6,7};
		//Taking input from console
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number of array elements");
		n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}		
		System.out.println(new BinarySearch().linearSearch(arr,n));
	}
}
