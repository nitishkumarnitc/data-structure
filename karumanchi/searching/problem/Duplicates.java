import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class Duplicates{

    /*BruteForce Algo*/
	public void findDuplicateBruteForce(int[] arr){
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length;j++ ) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate exist");
					return;
				}	
			}
		}
		System.out.println("Duplicate does not exist");
	}


	/*Sort First given array*/
	public void findDuplicateUsingSorting(int[] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]) {
				System.out.println("Duplicate exist");
				return;
			}	
		}
		System.out.println("Duplicate does not exist");
	}


	/*Using HashMap*/
	public void findDuplicateUsingHashMap(int[] arr){
	
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.get(arr[i])!=null){
				System.out.println("Duplicate exist");
				return;
			}

			map.put(arr[i],i);
		}
		System.out.println("Duplicate does not exist");
	}


	/*Using HashSet*/
	public void findDuplicateUsingHashSet(int[] arr){
		
			HashSet<Integer> set=new HashSet<>();
			for(int i=0;i<arr.length;i++){
				if(!set.add(arr[i])){
					System.out.println("Duplicate exists");
					return ;
				}
			}
			System.out.println("Duplicate does not exist");
	}

	/*Negating the A[A[i]] concept - works only if all elements are poitive in the range [0,n-1] and writable array*/
	public void findDuplicateUsingNegation(int[] arr){
		for (int i=0; i<arr.length;i++ ) {
			if(arr[Math.abs(arr[i])]<0) {
				System.out.println("Duplicate exists"+ arr[i]);
					return ;
			}
			arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
		}
		System.out.println("Duplicate does not exist");
	}

}

