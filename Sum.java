import java.util.Scanner;
class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array  :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Element of array :");
            int x=sc.nextInt();
            arr[i]=x;
        }
        int sum=0;
        for(int j=0;j<n;j++){
            sum=sum+arr[j];
        }
        System.out.print("Sum of Array Element :"+ sum);
        int pro=1;
        for(int i=0;i<n;i++){
            pro=pro*arr[i];
        }
        System.out.print("Sum of Array Element :"+ pro);
    }
}
