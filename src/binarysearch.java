import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Dynamically allocate the array
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        int index = search(arr, key);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
    public static int search(int arr[],int x){
        int low=0 , high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return -1;
    }
}
