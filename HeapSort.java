package heapsort;
import java.util.*;
public class HeapSort {
        void sort(int arr[])
    {
        int n = 5;
 
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }
    }
 
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  
        int l = 2*i + 1;
        int r = 2*i + 2;  
 
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        System.out.println("Enter 5 elements for array : ");
        int i;
        Scanner input=new Scanner(System.in);
        for (i=0;i<5;i++)
            arr[i]=input.nextInt();

        HeapSort ob = new HeapSort();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        for (i=0;i<5;i++)
            System.out.print(arr[i]+" ");
    }
    
}
