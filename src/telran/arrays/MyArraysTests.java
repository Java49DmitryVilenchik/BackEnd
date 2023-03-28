package telran.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


class MyArraysTests {

	@Test
	void testAddNumber() {
		int array[]= {1, 2, 3};
		int addNumber=4;
		int expected1[]= {1,2,3,4};
		int expected2[]=MyArraysIn.addNumber(array, addNumber);
		
		assertArrayEquals(expected1, expected2);
	}
	@Test
	void testRemoveNumber() {
		int array[]= {1, 2, 3, 4, 5};
		
		int removeIndex=2;
		int expected1[]= {1,2,4,5};
		int expected2[]=MyArraysIn.removeNumber(array, removeIndex);
		
		assertArrayEquals(expected1, expected2);
		
		int removeIndex1=0;
		int expected11[]= {2,3,4,5};
		int expected22[]=MyArraysIn.removeNumber(array, removeIndex1);
		
		assertArrayEquals(expected11, expected22);
		
		int removeIndex2=4;
		int expected33[]= {1,2,3,4};
		int expected44[]=MyArraysIn.removeNumber(array, removeIndex2);
		
		assertArrayEquals(expected33, expected44);
	}
	
	@Test
	void testInsertNumber() {
		int array[]= {1, 2, 4, 5};
		
		int insertIndex=2;
		int insertNumber=3;
		int expected1[]= {1,2,3,4,5};
		int expected2[]=MyArraysIn.insertNumber(array, insertIndex, insertNumber);		
				
		assertArrayEquals(expected1, expected2);
		
		int insertIndex1=0;		
		int expected3[]= {3,1,2,4,5};
		int expected4[]=MyArraysIn.insertNumber(array, insertIndex1, insertNumber);		
				
		assertArrayEquals(expected3, expected4);
		
		int insertIndex2=3;		
		int expected5[]= {1,2,4,3,5};
		int expected6[]=MyArraysIn.insertNumber(array, insertIndex2, insertNumber);		
				
		assertArrayEquals(expected5, expected6);
	}
	@Test
	void testCopyOf() {
		int array[]= {1,2,3};
		int expected1[]= {1,2,3};
		int expected2[]= {1};
		int expected3[]= {1,2,3,0,0,0};
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}
	@Test
	void testArraycopy() {
		int array[]= {1,2,3};
		int expected[]= {5,10,1,2,20};
		int arrayDest[]=new int[5];
		int array1[]= {2, 5, 10};
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		arrayDest[4]=20;
		assertArrayEquals(expected, arrayDest);
	}
	@Test
	void testBinarySearchInt() {
		//Arrays.binarySearch(array, number)
		//Arrays.binarySearch(int[] array, int number)   //int
		//TODO
		//write tests for method binarySearch taking array of int and int number
		int array[]= {5,-11, 2,10,-40};
		int key=5;
		assertTrue(MyArraysIn.binarySearch(array, key)==1);
	}
}
