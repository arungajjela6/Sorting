package com.selectionsort;

public class SelectionSorter {
 
	private int[] a;

	public SelectionSorter(int[] anArray) {
		
		a=anArray;
	}
	public void sort() {
		
		for(int i=0;i<a.length-1;i++) {
			int minpos=minimumPosition(i);
			swap(minpos,i);
		}
	}
	private int minimumPosition(int form) {
		int minpos=form;
		for(int i=form+1;i<a.length;i++)
			if(a[i]<a[minpos])minpos=i;
		return minpos;
	}
	private void swap(int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
}
