/*Element which occures max number of times*/
import java.io.*;
import java.util.*;


public class  MaxOccurence{

	/*Brute Force* -O(n2)/

	/*Sorting */
	public int maxOccurenceBySorting(int[] arr){

		Arrays.sort(arr);
		int maxOccuringElement=-1;

		if(arr.length>0) {
			maxOccuringElement=arr[0];
		}

		int count=1;
		int maxCount=1;

		for(int i=1; i<arr.length-1;i++){
			if(arr[i]==arr[i+1])
			{
				count++;
				if(count>maxCount) {
					maxCount=count;
					maxOccuringElement=arr[i];
				}
			} else {
				count=1;
			}
		}
		return maxOccuringElement;
	}


	/*using HashMap*/
	public int maxOccurenceUsingHashMap(int[] arr){
		HashMap<Integer,Integer> map=new HashMap<>();

		for (int i=0; i<arr.length; i++) {

			if(map.get(arr[i])!=null && map.get(arr[i]) >= 1){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}


		int maxOccurenceCount=map.get(arr[0]);
		int maxOccurenceElement=arr[0];

		for (int i=1; i<arr.length;i++ ) {
			if(map.get(arr[i])>maxOccurenceCount){
				System.out.println("Element: "+ arr[i] + "count: "+ map.get(arr[i]));
				maxOccurenceElement=arr[i];
				maxOccurenceCount=map.get(arr[i]);
			}
		}

		return maxOccurenceElement;
		
	}

	/* Using increament by k technique , element range : 0-K-1*/
	public int maxOccurenceUsingAdd(int[] arr, int k){

		
        // Iterate though input array, for every element
        // arr[i], increment arr[arr[i]%k] by k
        for (int i = 0; i< arr.length; i++)
            arr[(arr[i]%k)] += k;
 
        // Find index of the maximum repeating element
        int max = arr[0], result = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i]/k > max)
            {
                max = arr[i]/k;
                result = i;
            }
        }
        return max;

	}
}












