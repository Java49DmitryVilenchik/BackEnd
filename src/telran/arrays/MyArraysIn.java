package telran.arrays;

import java.util.Arrays;

public class MyArraysIn {
	public static int[] addNumber(int[] array, int num) {

		int len = array.length + 1;
		int[] arrayCopy = Arrays.copyOf(array, len);
		arrayCopy[arrayCopy.length - 1] = num;
		return arrayCopy;
	}

	public static int[] removeNumber(int[] array, int index) {
		// todo
		// removes element at a given index for right index value (0 - array.length-1)
		// and returns new array without the remove one
		// returns the source array for a wrong index value (less then 0 or greater then
		// array.length-1
		// using standard method System.arraycopy
		if (index < 0 || index > array.length - 1)
			return array;
		else {
			int arrayResault[] = new int[array.length - 1];
			System.arraycopy(array, 0, arrayResault, 0, index);
			System.arraycopy(array, index + 1, arrayResault, index, (array.length - 1 - index));
			return arrayResault;
		}
	}

	public static int[] insertNumber(int[] array, int index, int num) {
		// TODO
		// inserts a given num at a given index for right value of the index (0 -
		// array.length) and returns new array with the inserting number
		// return the source array for a wrong index value (less then 0 or greater then
		// array.length-1)
		// using standard method System.arraycopy
		if (index < 0 || index > array.length - 1)
			return array;
		else {
			int arrayResault[] = new int[array.length + 1];
			System.arraycopy(array, 0, arrayResault, 0, index);
			System.arraycopy(array, index, arrayResault, index + 1, (arrayResault.length - 1 - index));
			arrayResault[index] = num;
			return arrayResault;
		}
	}

	public static int binarySearch(int[] array, int key) {
		Arrays.sort(array);
		if (Arrays.binarySearch(array, key) >= 0)
			return 1;
		else
			return -1;
	}
}
