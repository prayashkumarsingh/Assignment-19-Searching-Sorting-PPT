package in.ineuron.question;
import java.util.*;
public class Question8 {
	public static int[] intersect(int[] nums1, int[] nums2) {
	    if (nums1.length > nums2.length)
	      return intersect(nums2, nums1);

	    List<Integer> ans = new ArrayList<>();
	    Map<Integer, Integer> count = new HashMap<>();

	    for (final int num : nums1)
	      count.put(num, count.getOrDefault(num, 0) + 1);

	    for (final int num : nums2)
	      if (count.containsKey(num) && count.get(num) > 0) {
	        ans.add(num);
	        count.put(num, count.get(num) - 1);
	      }

	    return ans.stream().mapToInt(Integer::intValue).toArray();
	  }
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
 
        int nums2[] = {2,2};
       
        printArray(intersect(nums1,nums2));
             
    }
}
