public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int target = 5;

        for(int i = 0 ; i<a.length; i++){
            if(a[i]==target){
                System.out.println("Target Found at index :"+i);
            }
        }
    }
}
