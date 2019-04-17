
public class Sort {
	public void selectionSort(int array[]) {
		for(int i=0; i<array.length; i++ ) {
			int min = i;
			for(int j=i+1; j<array.length-1; j++) {
				if(array[j]<array[min]) {
					min = j;
				}
			}
			swap(array, min, i);
		}
	}
	
	public void swap(int array[], int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
