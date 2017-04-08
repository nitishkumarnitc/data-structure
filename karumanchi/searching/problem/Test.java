import java.io.*;

public class Test{
	public static void main(String[] args) {

		int[] arr1={};
		int[] arr2={1};
		int[] arr3={1,2};
		int[] arr4={-1,-2};
		int[] arr5={3,4,-1,2,-2,-5};
		int[] arr6={0,0};
		int[] arr7={3,4,1,2,2,5};

		int[] arr8={4,3,5,4,1};
		int[] arr9={-9,-8,-7,-5,-4,-3,0,2};
		int[] arr10={1,1,1,1,1,1,1,1,1,1,0};
		/*System.out.println(new MaxOccurence().maxOccurenceUsingAdd(arr5,6));*/
		/*System.out.println(new FirstRepeating().findingFirstRepeatingUsingHashing(arr7));*/

		//System.out.println(new MissingNumber().findMissingNumberUsingHashing(arr8));
		//new Sum2k().sumClosetoZero(arr5);
		new Maxima().findFirstZero(arr10);
		
	
	}

}