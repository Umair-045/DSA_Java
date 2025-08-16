import java.util.Scanner;

public class SecondMinimum {
    public static void main(String[] args) {
        int[] a = {6,3,2,4,5,1};

        int min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;

        for(int i =0 ;i<a.length;i++){
            if(a[i]<min){
                sec_min=min;
                min=a[i];
            }
            else if(a[i]>min && a[i]<sec_min){
                sec_min = a[i];
            }
        }
        if(sec_min == Integer.MAX_VALUE){
            System.out.println("No Second Minimum");
        }
        else{
            System.out.println("Minimum Value is :"+min);
            System.out.println("Second Minimum Value is :"+sec_min);
        }
    }
}