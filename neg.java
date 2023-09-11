import java.util.*;
public
class Main {
    public
    static void shift(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) swap(arr, i, j);
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // used for swapping ith and jth elements of array
    public
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public
    static void main(String[] args) throws Exception {
        

        int[] arr = new int[]{ -1,0,3,1,-4}; 
       
        shift(arr);
    }
}