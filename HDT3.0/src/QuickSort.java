
public class QuickSort {
	public void quick(int[] arreglo, int primero, int ultimo) {
		int i,j,pivote,auxiliar;
		i=primero;
		j=ultimo;
		pivote = arreglo[(primero+ultimo)/2];
		do{
			while(arreglo[i]<pivote) {
				i++;
			}
			while(arreglo[j]>pivote) {
				j--;
			}
			if(j>=i) {
				auxiliar=arreglo[i];
				arreglo[i]=arreglo[j];
				arreglo[j]=auxiliar;
				i++;
				j--;
			}
		}while(i<=j);
		if(primero<j) {
			quick(arreglo,primero,j);
		}
		if(i<ultimo) {
			quick(arreglo, i,ultimo);
		}
		System.out.println("El arreglo Ordenado con quick es:");
		mostrarArreglo(arreglo);
	}
	public void mostrarArreglo(int[] arreglo) {
		int k;
		for(k=0; k< arreglo.length;k++) {
			System.out.println("("+ arreglo[k] +")");
		}
	}
}
