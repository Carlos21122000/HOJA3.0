
public class SelectionSort {
	public int[] selectionSort() {
        int[] lista = null;
		int[] arrayOrdenar = lista;
        
       for (int i = 1; i < arrayOrdenar.length; i++){
            int temp = arrayOrdenar[i];
            int j;
            for (j = i - 1; j >= 0 && temp < arrayOrdenar[j] ; j--){
                arrayOrdenar[j + 1] = arrayOrdenar[j];
        }
            arrayOrdenar[j + 1] = temp;
        }
        
        return arrayOrdenar;
                
    }
}
