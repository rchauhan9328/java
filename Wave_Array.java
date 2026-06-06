import java.util.Scanner;
class Wave_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  Size of Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a element of array:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
