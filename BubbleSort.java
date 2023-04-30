import java.util.*;
class BubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items you want:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Elements after Bubble Sort:");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}