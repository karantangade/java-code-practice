    package Arrray;

    import java.util.Scanner;

    public class update {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the size of the Array");
            int size=sc.nextInt();

            int arr[]=new int[size];
            System.out.println("Enter the Elements in the Array");

            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }

            System.out.println("Enter the index where you want to insert");
            int index=sc.nextInt();
            System.out.println("Enter the vlue which you want to insert");
            int insert=sc.nextInt();

            // for (int i = 0; i < arr.length; i++) {
            //     if (i==index) {
            //         arr[i]=insert;
            //     }
            // }
            if (index>=0 && index<arr.length) {
                arr[index]=insert;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            } else {
                System.out.println("invalid insex");
            }
            
        }
    }
