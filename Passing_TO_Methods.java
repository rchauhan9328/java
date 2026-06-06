class Passing_TO_Methods {
    public static void main(String[] args) {
        // int[] arr=new int[5];
        // int x=14;
        // arr[3]=56;
        // arr[1]=9;
        // change(arr,x);
        int x[]={10,3,28};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] arr){
        arr[0]=19;
        arr[2]=112;
        // y=55;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // System.out.println(y);
    }
}
