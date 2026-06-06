import java.util.Scanner;
class InputOroutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            //Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number :");
            int x= sc.nextInt();
            arr[i]=x;//values assing
        }
        // output & input of array using loop
        for(int j=0;j<n;j++){
            System.out.print(2*arr[j]+" ");
        }

    }
}
