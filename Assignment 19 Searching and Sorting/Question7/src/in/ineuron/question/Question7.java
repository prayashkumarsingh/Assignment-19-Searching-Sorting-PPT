package in.ineuron.question;

import java.util.*;
import java.util.stream.Collectors;

public class Question7 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> ans = new ArrayList<>();
		Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

		for (final int num : nums2)
			if (set.remove(num))
				ans.add(num);

		return ans.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
        int nums1[] = {4,9,5};
 
        int nums2[] = {9,4,9,8,4};
       
        printArray(intersection(nums1,nums2));
             
    }
}
