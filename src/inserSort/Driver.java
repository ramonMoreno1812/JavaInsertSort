

package inserSort;


public class Driver {
	
public static void main(String[] args) {
		
		// create a new array of primitive type int
		int[] myArray = {5, 6, 1, 20, 11, 25, 36, 2, 0};
		// create a new string array
		String[] stringArray = {"Zeno", "Gunter", "Solaris", "Anabell", "Ryu"};
		
		// new instance of this class
		Driver myDriver = new Driver();
		
		//print before sorting
		myDriver.printArray(myArray);
		myDriver.printStringArray(stringArray);
		
		//sort my array with insert sort
		myDriver.insertSort(myArray);
		myDriver.insertSortStrings(stringArray);
		
		System.out.println();
		//print after sorting
		myDriver.printArray(myArray);
		myDriver.printStringArray(stringArray);
		
	}

	
	// print an array 
	public void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	// print array of strings
	public void printStringArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	// insert sort with Strings
	public void insertSortStrings(String[] arr) {
		int arrLength = arr.length;
		
		for(int i = 1; i < arrLength; i++) {
			
			String temp = arr[i];
			int j = i -1; // sorted part
			
			// compareTo returns a positive number if s1 > s2
			// returns a negitive if s1 < s2
			// returns 0 if s1 == s2
			while(j >= 0 && arr[j].compareToIgnoreCase(temp) > 0) {
				arr[j + 1] = arr[j]; // shift larger elements by one positon
				j = j -1;
			}
			arr[j+1] = temp;
		}
	}
	
	// insert sort code.
	public void insertSort(int[] arr) {
		
		// compute number of elements in my array
		int arrayLength = arr.length;
		
		// i start from 1 because the first index is sorted.
		for(int i = 1; i < arrayLength; i++) { // value tracked by I is unsoted array part
			int tempVariable = arr[i];
			int j = i -1; // keep track of the part of arry that is sorted
			while(j >= 0 && arr[j] > tempVariable) {
				arr[j +1] = arr[j];// shifting larger elements to temp by 1 position
				j = j -1;
			}
			arr[j+1] = tempVariable;
		}
	}
	
}
