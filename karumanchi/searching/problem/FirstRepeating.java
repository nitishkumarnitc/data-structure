/*Element which occures max number of times*/
import java.io.*;
import java.util.*;


public class FirstRepeating{

	/*Brute Force -O(n2)*/

	/*Sorting - will not work*/

	/* Hashing - modified will work*/
	public int findingFirstRepeatingUsingHashing(int[] arr){

		HashMap<Integer,Integer> map= new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			if(map.get(arr[i])!=null){
				map.put(arr[i], - Math.abs(map.get(arr[i])));
			}else{
				map.put(arr[i],i+1);
			}
		}

		int highestNegativeIndex=Integer.MIN_VALUE;
		for (int i=0; i<arr.length;i++ ) {
			if(map.get(arr[i]) < 0 && map.get(arr[i]) > highestNegativeIndex){
				highestNegativeIndex=map.get(arr[i]);
			}
		}

		return arr[Math.abs(highestNegativeIndex+1)];
	} 
	
}
