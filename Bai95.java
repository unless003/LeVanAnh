import java.util.*; 
import java.io.*; 
 public class Bai95 {
 public static void main(String[] args)
 {
    int n= 9;
	String[] arr_string = new String[n];
	
    for(int i = 0; i < n; i++)
        arr_string[i] = String.valueOf(i);                                  
	 System.out.println("Mang moi: "+Arrays.toString(arr_string)); 
	 }
}