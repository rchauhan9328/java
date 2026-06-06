import java.util.Scanner;
class CharA{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of name ");
        int n=sc.nextInt();
        sc.nextLine();
        // char[] ch=new char[2];
        // for(int i=0;i<ch.length;i++){
        //     System.out.println(ch[i]);
        // }
        // int x=100;
        // System.out.print((char)x);
        //String[] sc={ "ravina","chauhan ","khari"};
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter your name :");
            str[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.print(str[i]+" ");
        }


    }
}