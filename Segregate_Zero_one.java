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

        //segregate(arr, n);
        int Count_Zero=0;
        int Count_One=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                Count_Zero++;
            }
            else{
                Count_One++;
            }

        }
        int i;
        for( i=0;i<Count_Zero;i++){
            arr[i]=0;
        }
        for(i=Count_Zero;i<n;i++){
            arr[i]=1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

        // System.out.print("Segregated Array: ");
        // for (int x : arr) {
        //     System.out.print(x + " ");
        // }
    }

    
}
