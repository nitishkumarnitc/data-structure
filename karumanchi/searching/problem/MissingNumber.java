/*Element which occures max number of times*/
import java.io.*;
import java.util.*;


public class MissingNumber{

	/* Brute Force -O(n2) */

	/* Sorting range-0- (n-1) */
	public int findMissingNumber(int[] arr){
		Arrays.sort(arr);
		int i=0;
		for( ; i<arr.length; i++){
			if(arr[i]!=i+1) break;
		}
		return i+1;
	}

	/* Hashing Technique */
	public int findMissingNumberUsingHashing(int[] arr){
		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			map.put(i+1,0);
		}

		for (int i=0; i<arr.length; i++) {
			map.put(arr[i],1);
		}

		int i=0;
		for (; i<arr.length; i++) {
			if(map.get(i+1)==0) {
				break;
			}
		}
		return i+1;
	}

	/* Maths */
	public int findMissingNumberUsingMath(int[] arr){
		int sum=n*(n+1)/2;
		int initialSum=0;
		for (int i=0; i<arr.length; i++) {
			initialSum+=arr[i];			
		}
		return sum-initialSum;
	}
	

	/*Using XOR*/	
	public int findMissingNumberUsingXOR(int[] arr){
		int x=0;
		for (int i=0; i<arr.length; i++) {
			x^=arr[i];
		}
		for (int i=1; i<=arr.length; i++) {
			x^=i;
		}
		return x;
	}
}














