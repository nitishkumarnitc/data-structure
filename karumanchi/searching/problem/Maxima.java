import java.util.*;
import java.io.*;

public class Maxima{

	/* Numbers first increases then decreases, find point of maxima - O(log(n))*/
	public int findMaximabyBinarySearch(int[] arr){
		int low=0;
		int high=arr.length-1;
		int mid=low+(high-low)/2;

		if(arr.length==1) return arr[0];
		else if(arr.length==2) return Math.max(arr[0],arr[1]);
		else if(arr.length>=3){
			while(low<=high){
				mid=low+(high-low)/2;
				if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
					break;
				}else if (arr[mid] > arr[mid-1] && arr[mid+1] > arr[mid]) {
					low=mid+1;
				}else{
					high=mid-1;
				}
			}
			
		}
		return arr[mid];

	}

	/* Find where positive numbers started, numbers are first negative and increasing then eventually 

	numbers becomes positive and also increasing - increasing function  */

	public void findFirstPositiveNumber(int[] arr){
		int i=0;
		for(; arr[i]>=arr.length || arr[i]>0; i*=2){}
		i=i/2;
		while(arr[i]<arr.length){
			if(arr[i]>0){
				System.out.println("First Positive Number is : "+arr[i]);
				break;
			}else {
				i++;
			}
		}

	}

	/* 1's in the beginning and 0's in the end - donot know the length of stream - check at the rate of 2^k*/
	public void findFirstZero(int[] arr){
		
		if(arr[0]==0) {
			System.out.println("First zero index is : "+ 1);
			return;
		}

		int i=1;
		boolean indexOutofBond=false;
		boolean zeroFound=false;

		while(!indexOutofBond && !zeroFound){
			
			try{
				System.out.println(" "+arr[i]);

				if(arr[i]==0) {
					zeroFound=true;		
				}
			}catch(ArrayIndexOutOfBoundsException ex){
				indexOutofBond=true;
			}
			i=i*2;
		}

		i=i/2;

		indexOutofBond=false;
		while(!indexOutofBond){
			try{
				if(arr[i]==0){
					break;
				}
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("No zeros found");
				indexOutofBond=true;
			}
		}
		
		if(indexOutofBond) return;
		System.out.println("First zero index is : "+ (i+1));
	}


}




