package in.ineuron.question;

public class Question2 {
	void lowerArray(int arr[], int countSmaller[], int n) {
		int i, j;
		for (i = 0; i < n; i++)
			countSmaller[i] = 0;

		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[i])
					countSmaller[i]++;
			}
		}
	}

	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println("");
	}
	public static void main(String[] args) {
		Question2 small = new Question2();
		int arr[] = {5,2,6,1};
		int n = arr.length;
		int low[] = new int[n];
		small.lowerArray(arr, low, n);
		small.printArray(low, n);
	}
}
