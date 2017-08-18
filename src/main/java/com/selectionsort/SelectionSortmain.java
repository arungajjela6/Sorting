package com.selectionsort;

import java.util.Arrays;

public class SelectionSortmain {

	public static void main(String[] args) {
		
		int[] a= {4,5,8,1,9,7,5,10,4,9};
		System.out.println("Array before Sorting"+Arrays.toString(a));
		
		SelectionSorter sorter=new SelectionSorter(a);
		double start = System.currentTimeMillis();
		System.out.println(start);
		sorter.sort();
		System.out.println("Array after Sorting"+Arrays.toString(a));
		double end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println();
		double time=end-start;
        System.out.println("Time "+time);
		
	}

}
