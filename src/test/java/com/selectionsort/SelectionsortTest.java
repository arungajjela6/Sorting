package com.selectionsort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SelectionsortTest {

	@Test
	public void test() {
		
		int[] beforeSort = {10,15,17,23,10,2,7,15,9,16,27,55,99,20,43,16};
		int[] afterSort  = {2,7,9,10,10,15,15,16,16,17,20,23,27,43,55,99};
		
		System.out.println("Array before Sort"+Arrays.toString(beforeSort));
		System.out.println("Array after Sort"+Arrays.toString(afterSort));
		
		SelectionSorter sorter=new SelectionSorter(beforeSort);
		sorter.sort();
		System.out.println("Array before Sort"+Arrays.toString(beforeSort));
		System.out.println("Array after Sort"+Arrays.toString(afterSort));
		
		assertEquals(Arrays.toString(beforeSort),Arrays.toString(afterSort));
		
	}

}
