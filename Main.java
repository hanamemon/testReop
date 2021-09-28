class Main {

public static int sumArray(int[] arr) {

// first compute the sum to the right of the first element then add the right element
// 

	return sumArrayRec(arr,0);
	
} 

public static int sumArrayRec(int[] arr, int start_index) {

	if (start_index == arr.length-1){		
	return arr[start_index];
		}

int tempSum = sumArrayRec(arr, start_index + 1);

return tempSum + arr[start_index];

 
} 
	public static int factorial(int n) {
	
	if(n == 1) { // base case 
		return 1; 
		// if don't have this, stack space exceeded, will crash
	}

	else {
		return n * factorial (n-1); // recursive call 
// have to make progress towards base case or else program won't end 
	}

} 
  public static void main(String[] args) {
    System.out.println(factorial(5));

		int arr[] = {1,2,3,4,5};
		System.out.println(sumArray(arr));
  }


}