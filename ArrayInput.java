import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        // Input the size
        int n = sc.nextInt();
        // Create an array
        int arr[] = new int[n];
        // Take the elements as input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter "+(i+1)+" element: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
    
}