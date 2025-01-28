import java.util.Scanner;

public class LargestandSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements:");
        for (int i =0; i < size; i++) {
            System.out.print("Element " +(i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}