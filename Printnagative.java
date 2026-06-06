import java.util.Scanner;
class Printnagative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size :");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Array Element :");
            int x =sc.nextInt();
            arr[i]=x;
           // System.out.print("arr");
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                System.out.print(arr[j]+" ");
            }
            
        }
    }
    
}
