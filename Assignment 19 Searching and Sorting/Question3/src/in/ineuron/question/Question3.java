package in.ineuron.question;

public class Question3 {
	public static void printArray(int arr[], int N) {
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] sortArray(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }

	public static void main(String[] args) {
		int arr[] = {5,2,3,1};
		int N = arr.length;
		sortArray(arr);
		printArray(arr, N);
	}
}
