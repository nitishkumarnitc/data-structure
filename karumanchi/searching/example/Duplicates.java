import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
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
	public void findDuplicateSort(int[] arr){
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
	public void findDuplicateHashMap(int[] arr){
	
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
	public void findDuplicateHashSet(int[] arr){
		
			HashSet<Integer> set=new HashSet<>();
			for(int i=0;i<arr.length;i++){
				if(!set.add(arr[i])){
					System.out.println("Duplicate exists");
					return ;
				}
			}
			System.out.println("Duplicate does not exist");
	}


	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,7};
		/*new Duplicates().findDuplicateBruteForce(arr);*/
		/*new Duplicates().findDuplicateSort(arr);*/
		/*new Duplicates().findDuplicateHashMap(arr);*/
		new Duplicates().findDuplicateHashSet(arr);
	}

}

