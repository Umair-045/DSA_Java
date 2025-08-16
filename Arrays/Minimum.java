public class Minimum {
    public static void main(String[] args) {
        int[] a = {6,1,2,3,4,5};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The Minimum Value is :"+min);
    }
}
