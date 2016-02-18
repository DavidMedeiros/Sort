public class Sort<T> {

	@SuppressWarnings("unchecked")
	public void bubbleSort(T[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (((Comparable<T>) vetor[j]).compareTo(vetor[j + 1]) > 0) {
					T aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void selectionSort(T[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int minimo = i;
			for (int j = i+1; j < vetor.length; j++) {
				if (((Comparable<T>) vetor[j]).compareTo(vetor[minimo]) < 0){
					minimo = j;
				}
			}
			
			if (minimo != i) {
				T aux = vetor[i];
				vetor[i] = vetor[minimo];
				vetor[minimo] = aux;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void insertionSort(T[] vetor) {
		for (int i = 1; i < vetor.length; i++) {
			T key = vetor[i];
			int j = i - 1;
			while ((j >= 0) && (((Comparable<T>) key).compareTo(vetor[j]) < 0)) {
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = key;	
		}
	}
	
	public static void main(String[] args) {
		Sort<Integer> sort = new Sort();
		
		// Cria Arrays
		Integer[] array1 = {3,2332,223,12,4};
		Integer[] array2 = {0,4,2,27,18,20};
		Integer	[] array3 = {9,8,7,6,5,4,3,2,100};
		
		// Imprime Arrays desordenados
		System.out.println("Arrays desordenados:");
		System.out.println(java.util.Arrays.toString(array1));
		System.out.println(java.util.Arrays.toString(array2));
		System.out.println(java.util.Arrays.toString(array3));
		System.out.println(" ");
		
		// Ordena com Bubble Sort
		sort.bubbleSort(array1);
		
		// Ordena com Selection Sort
		sort.selectionSort(array2);
		
		// Ordena com Insertion Sort
		sort.insertionSort(array3);
				
		// Imprime Arrays ordenados
		System.out.println("Arrays ordenados:");
		System.out.println(java.util.Arrays.toString(array1));
		System.out.println(java.util.Arrays.toString(array2));
		System.out.println(java.util.Arrays.toString(array3));
	}
}

