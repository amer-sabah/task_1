package jo.secondstep.sort.quick;

public class QuickSort {
	
	public static void quickSort(int[] data, int start, int end) {
		
		System.out.println("start:" + start + " end:" + end);
		
		if(end - start <= 0) {
			return;
		}
		
		
		int p = end;
		int i = start-1; //-1
		int j = start;
		
		while(j < p) {
			
			if(data[j] < data[p]) {
				i++;
				
				int temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
			
			
			j++;
		}
		
		int pValue = data[p];
		
		//shift data
		for(int k = end; k > (i + 1) ; k--) {
			data[k] = data[k-1];
		}
		
		//add pivot value
		data[i + 1] = pValue;
		
		if(i != start-1) {
			quickSort(data, start, i);
		}
		
		if(i + 2 <= end) {
			quickSort(data, i + 2, end);
		}
		
	}

	public static void sort(int[] data) {
		quickSort(data, 0, data.length -1);
//		quickSort(data, 2, 5);

	}

	public static void main(String[] args) {

		int[] data = new int[] { 8, 2, 6, 10, 7, 4 };
//		int[] data = new int[] { 2, 4, 8, 6, 10, 7 };
		
		for(int i = 0; i < data.length;i++) {
			System.out.print(data[i] + " ");
		}
		
		System.out.println("\n---- Before Sort ----");

		sort(data);
		
		for(int i = 0; i < data.length;i++) {
			System.out.print(data[i] + " ");
		}
	}
}
