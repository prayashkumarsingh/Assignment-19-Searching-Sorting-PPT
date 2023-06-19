package in.ineuron.question;
import java.io.*;
public class Question5 {
	void rightrotate(int arr[], int n, int outofplace, int cur) {
		int tmp = arr[cur];
		for (int i = cur; i > outofplace; i--)
			arr[i] = arr[i - 1];
		arr[outofplace] = tmp;
	}

	void rearrange(int arr[], int n) {
		int outofplace = -1;

		for (int index = 0; index < n; index++) {
			if (outofplace >= 0) {
				if (((arr[index] >= 0) && (arr[outofplace] < 0)) || ((arr[index] < 0) && (arr[outofplace] >= 0))) {
					rightrotate(arr, n, outofplace, index);
					if (index - outofplace >= 2)
						outofplace = outofplace + 2;
					else
						outofplace = -1;
				}
			}
			if (outofplace == -1) {
				if (((arr[index] >= 0) && ((index & 0x01) == 0)) || ((arr[index] < 0) && (index & 0x01) == 1))
					outofplace = index;
			}
		}
	}

	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	public static void main(String[] args) {
		Question5 rearrange = new Question5();
		int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
		int n = arr.length;

		System.out.println("Given array is ");
		rearrange.printArray(arr, n);

		rearrange.rearrange(arr, n);

		System.out.println("RearrangeD array is ");
		rearrange.printArray(arr, n);
	}
}
