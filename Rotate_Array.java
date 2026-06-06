import java.util.Scanner;
class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a size of Array :");
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a element of Array :");
            arr[i]=sc.nextInt();
        }
        System.out.print("ENter A number of Rotate Array:");
        int d=sc.nextInt();
        rotateArr(arr, d,n);
    //     Reverse(0,d-1,arr);
    //     Reverse(d, n-1, arr);
    //    // Reverse(d, d, arr);
    //     Reverse(0, n-1, arr);
           for(int ele:arr){
               System.out.print(ele+" ");
           }

        
    }
    static void rotateArr(int[] arr, int d,int n ) {
        Reverse(0,d-1,arr);
        Reverse(d, n-1, arr);
       // Reverse(d, d, arr);
        Reverse(0, n-1, arr);
    }
    static void Reverse(int i ,int j,int[] arr){
        
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
    
}
