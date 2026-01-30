// import java.util.Scanner;

// public class Task1 {
    
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter index: ");
//         int index = sc.nextInt();

//         if (index >= 0 && index < arr.length) {
//             System.out.println("Element at index " + index + " is: " + arr[index]);
//         } else {
//             System.out.println("Invalid index");
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Task3 {
//     public static void main(String[] args) {
//         int[] arr = {5, 10, 15, 20, 25}; // sorted array
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter element to search: ");
//         int key = sc.nextInt();

//         int low = 0;
//         int high = arr.length - 1;
//         boolean found = false;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (arr[mid] == key) {
//                 System.out.println("Element found at index: " + mid);
//                 found = true;
//                 break;
//             } else if (arr[mid] < key) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }

//         if (!found) {
//             System.out.println("Element not found");
//         }

//         sc.close();
//     }
// }

// public class Task4 {
//     public static void main(String[] args) {

//         int[] arr = {12, 45, 7, 89, 34};

//         int max = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         System.out.println("Maximum element is: " + max);
//     }
// }


// import java.util.Arrays;
// import java.util.Scanner;

// public class Task5 {
//     public static void main(String[] args) {

//         int[] arr = {7, 10, 4, 3, 20, 15};
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter value of K: ");
//         int k = sc.nextInt();

//         Arrays.sort(arr); // sort array

//         if (k > 0 && k <= arr.length) {
//             System.out.println("Kth smallest element is: " + arr[k - 1]);
//         } else {
//             System.out.println("Invalid K value");
//         }

//         sc.close();
//     }
// }



// public class Task6 {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 3, 4};

//         System.out.println("All possible pairs are:");

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 System.out.println("(" + arr[i] + ", " + arr[j] + ")");
//             }
//         }
//     }
// }
