import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {
		/**1
		 * 
		 * @author Carlos Raxtum 19721
		 * älgoritmos y estructura de datos
		 * @return 
		 */ 

	public static void main(String[] args){
		int vector1[]= {34,4,76,3,5,7,23,432,5,76,3,8,987,43,2,4,678,763,32,658,2,345};
		QuickSort quick = new QuickSort();
		RadixSort radix = new RadixSort();
		MergeSort merge = new MergeSort();
		SelectionSort selection = new SelectionSort();
		GnoSort gno = new GnoSort();
		
		
		String opciones ="";
		System.out.println("Menu por consola");
        System.out.println("1.- SelecionSort");
        System.out.println("2.- QuickSort");
        System.out.println("3.- MergeSort");
        System.out.println("4.- RadixSort");
        System.out.println("5.- GnemoSort");
        System.out.println("Ingrese el numero de sort que desee realizar: "); //Pretendo que el usuario escriba el numero de  opcion
        Scanner sc = new Scanner(System.in);
        opciones=sc.nextLine();


        switch (opciones) {
            case "1":
                // codigo
	       		 try {
	       	            String ruta = "/C:\\Users\\craxt\\eclipse-workspace\\HDT3.0/SelectionSort.txt";
	       	            //selection.selectionSort(vector1);
	       	            String contenido = "Contenido de SeleccionSort";
	       	            File file = new File(ruta);
	       	            // Si el archivo no existe es creado
	       	            if (!file.exists()) {
	       	                file.createNewFile();
	       	            }
	       	            FileWriter fw = new FileWriter(file);
	       	            BufferedWriter bw = new BufferedWriter(fw);
	       	            bw.write(contenido);
	       	            bw.close();
	       	            System.out.println("Su archivo se ha agregado a la carpeta");
	       	        } catch (Exception e) {
	       	            e.printStackTrace();
	       	        }
                break;

            case "2":
            	//codigo
            	try {
       	            String ruta = "/C:\\Users\\craxt\\eclipse-workspace\\HDT3.0/QuickSort.txt";
       	            quick.quick(vector1, 0, 0);
       	            String contenido = "Contenido de QuickSort";
       	            File file = new File(ruta);
       	            // Si el archivo no existe es creado
       	            if (!file.exists()) {
       	                file.createNewFile();
       	            }
       	            FileWriter fw = new FileWriter(file);
       	            BufferedWriter bw = new BufferedWriter(fw);
       	            bw.write(contenido);
       	            bw.close();
       	            System.out.println("Su archivo se ha agregado a la carpeta");
       	        } catch (Exception e) {
       	            e.printStackTrace();
       	        }
                break;

            case "3":
                // codigo
            	try {
       	            String ruta = "/C:\\Users\\craxt\\eclipse-workspace\\HDT3.0/MergeSort.txt";
       	            merge.sort1(vector1);
       	            String contenido = "Contenido de MergeSort";
       	            File file = new File(ruta);
       	            // Si el archivo no existe es creado
       	            if (!file.exists()) {
       	                file.createNewFile();
       	            }
       	            FileWriter fw = new FileWriter(file);
       	            BufferedWriter bw = new BufferedWriter(fw);
       	            bw.write(contenido);
       	            bw.close();
       	            System.out.println("Su archivo se ha agregado a la carpeta");
       	        } catch (Exception e) {
       	            e.printStackTrace();
       	        }
                break;

            case "4":
                // codigo
            	try {
       	            String ruta = "/C:\\Users\\craxt\\eclipse-workspace\\HDT3.0/RadixSort.txt";
       	            radix.radix(vector1);
       	            String contenido = "Contenido de RadixSort";
       	            File file = new File(ruta);
       	            // Si el archivo no existe es creado
       	            if (!file.exists()) {
       	                file.createNewFile();
       	            }
       	            FileWriter fw = new FileWriter(file);
       	            BufferedWriter bw = new BufferedWriter(fw);
       	            bw.write(contenido);
       	            bw.close();
       	            System.out.println("Su archivo se ha agregado a la carpeta");
       	        } catch (Exception e) {
       	            e.printStackTrace();
       	        }
                break;
            case "5":
                // codigo
            	try {
       	            String ruta = "/C:\\Users\\craxt\\eclipse-workspace\\HDT3.0/GnoSort.txt";
       	            gno.GnomeSort(vector1);
       	            String contenido = "Contenido de GnomeSort";
       	            File file = new File(ruta);
       	            // Si el archivo no existe es creado
       	            if (!file.exists()) {
       	                file.createNewFile();
       	            }
       	            FileWriter fw = new FileWriter(file);
       	            BufferedWriter bw = new BufferedWriter(fw);
       	            bw.write(contenido);
       	            bw.close();
       	            System.out.println("Su archivo se ha agregado a la carpeta");
       	        } catch (Exception e) {
       	            e.printStackTrace();
       	        }
                break;
            default:
            	System.out.println("Esta opcion no esta disponible");
				break;    
        }
	}
}
