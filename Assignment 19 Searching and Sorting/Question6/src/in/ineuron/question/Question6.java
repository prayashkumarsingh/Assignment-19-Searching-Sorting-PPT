package in.ineuron.question;
import java.util.*;
public class Question6 {
	public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5};
        int n1 = arr1.length;
 
        int arr2[] = {2, 4, 6, 8};
        int n2 = arr2.length;
 
        int arr3[] = new int[n1 + n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);
             
    }
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
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
     
    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
        int i = 0; 
        int j = 0; 
        int k = 0;
        while(i < n1){  
         arr3[k++] = arr1[i++];  
        }
        while(j < n2){  
         arr3[k++] = arr2[j++];  
        }
        sortArray(arr3); 
        printArray(arr3);
    }
}
