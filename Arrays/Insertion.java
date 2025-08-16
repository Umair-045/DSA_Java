import java.util.Scanner;

public class Insertion {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] a= {1,2,3,4,5};
        int[] b= new int[6];



        for (int i=0;i< a.length;i++){
            System.out.println(a[i]+" ");
        }

        System.out.println("Enter the value that you want to insert :");
        int value = sc.nextInt();

        System.out.println("Enter the psition where you want to insert :");
        int pos = sc.nextInt();

        for(int j=0; j< b.length;j++){
            if(j<pos){
                b[j]=a[j];
            } else if (j==pos){
                b[j]=value;

            } else if (j>pos) {
                b[j]=a[j-1];

            }

        }

        for(int j=0; j< b.length;j++){
            System.out.print(b[j]+" ");
        }

    }
}
