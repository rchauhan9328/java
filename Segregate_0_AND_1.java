import  java.util.Scanner;
class Segregate_0_AND_1 {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.print("Enetr of Array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enetr of Array Element:");
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            if(arr[i]==1&& arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+"");
        }

    }
}
