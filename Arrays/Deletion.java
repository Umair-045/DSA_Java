import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int[] b = new int[4];


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }


        System.out.println("Enter the index from where you want to delete value :");
        int index = sc.nextInt();

        for(int j = 0; j < b.length; j++){
            if(j<index){
                b[j]=a[j];
            }
            else if (j==index) {
                b[j]=a[j+1];
            }
        else if (j>index) {
                b[j]=a[j+1];

            }
        }
        for(int j = 0; j < b.length; j++){
            System.out.print(b[j]+" ");
        }

    }
}
