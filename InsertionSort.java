import java.util.*;
class InsertionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.println("List after Insertion Sort:");
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}