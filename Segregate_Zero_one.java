import java.util.Scanner;
public class Segregate_Zero_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        segregate(arr, n);

        System.out.print("Segregated Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static void segregate(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            // Move left pointer until a 1 is found
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Move right pointer until a 0 is found
            while (left < right && arr[right] == 1) {
                right--;
            }
            // Swap the 1 on left with the 0 on right
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}
