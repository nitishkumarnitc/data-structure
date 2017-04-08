import java.io.*;
import java.util.*;

public class Sum2k{
	/*Sorting Technique*/
	public void sum2kUsingSorting(int[] arr, int k){
		for (int i=0,j=arr.length-1; i<=j;) {
			if(arr[i] + arr[j] == k){
				System.out.println("Ith element:"+ arr[i] + "Jth element: "+ arr[j]);
				return;	
			}else if (arr[i]+arr[j]<k) {
				i++;
			}else{
				j--;
			}
		}
	}

	/*Hashing Technique*/
	public void sum2kUsingHashing(int[] arr, int k){

		HashMap<Integer,Integer> map=new HashMap<>();

		for (int i=0; i<arr.length; i++) {
			if(map.get(k-arr[i])!=null){
				int jthElement=k-arr[i];
				System.out.println("Ith element:"+ arr[i] + "Jth element: "+jthElement );
				return;
			}else{
				map.put(arr[i],i);
			}
		}
	}


	/* A[i]<sub>2</sub> + A[j]<sub>2</sub> = a[k]<sub>2</sub>*/
	public void sum2Squarek2(int[] arr, int k){
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=arr[i]*arr[i];
		}

		for (int i=0,j=arr.length-1; i<=j;) {
			if(arr[i] + arr[j] == k*k){
				System.out.println("Ith element:"+ Math.sqrt(arr[i]) + "Jth element: "+ Math.sqrt(arr[j]) + "and k is : "+k );
				return;	
			}else if (arr[i]+arr[j]<k) {
				i++;
			}else{
				j--;
			}
		}

	}

	/* Two number whose sum is closest to zero*/
	public void sumClosetoZero(int[] arr){
		int positiveClosest=Integer.MAX_VALUE;
		int negativeClosest=Integer.MIN_VALUE;
		Arrays.sort(arr);

		for (int i=0,j=arr.length-1; i<j ; ) {
			int temp=arr[i]+arr[j];
			if(temp==0) {
				System.out.println("Closest sum is "+ temp);
				return;
			}else if (temp<0) {
				if(negativeClosest<temp) negativeClosest=temp;
				i++;
			}else{
				if(positiveClosest>temp) positiveClosest=temp;
				j--;
			}
		}

		int closestSum=positiveClosest < Math.abs(negativeClosest)?positiveClosest:Math.abs(negativeClosest);
		System.out.println("Closest sum is "+ closestSum);

	}

	/*Three numbers whose sum is equal to k*/
	public void sum3k(int[] arr, int k){
		if(arr.length>=3){
			Arrays.sort(arr);
			for (int i=0;i<arr.length-2; i++; ) {
				for (j=i+1,j=arr.length-1; j<l; ) {
					int temp=arr[i]+arr[j]+arr[l];
					if(temp==k){
						System.out.println("First element: "+ arr[i] + "Second element: "+ arr[j] + "Third element: "+ arr[l]);
					}
					else if (temp<k) {
						j++;
					}else{
						k--;
					}
				}
			}

		}
	}

	/*Three numbers whose sum is closest to k*/
	public void sum3ClosesttoK(int[] arr, int k){
		int positiveClosest=Integer.MAX_VALUE;
		int negativeClosest=Integer.MIN_VALUE;
		if(arr.length>=3){
			for (int i=0;i<arr.length-2; i++; ) {
				for (j=i+1,l=arr.length-1; j<l; ) {
					int temp=arr[i]+arr[j]+arr[l];
					if(temp==k){
						System.out.println("Closest sum is : "+ temp);
					}
					else if (temp<k) {

						if (temp>negativeClosest) {
							negativeClosest=temp;
						}
						j++;
					}else{
						if (temp<positiveClosest) {
							negativeClosest=temp;
						}
						k--;
					}
				}
			}
			System.out.println("Closest sum is : "+ 
				positiveClosest<Math.abs(negativeClosest)?positiveClosest:Math.abs(negativeClosest));

		}

	}



}







